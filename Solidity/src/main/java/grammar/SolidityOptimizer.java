package grammar;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;

public class SolidityOptimizer {
    private SolidityParser parser;
    private String fileName;

    public SolidityOptimizer(SolidityParser parser, String fileName) {
        this.parser = parser;
        this.fileName = fileName;
    }

    public void analyzeAndOptimize() {
        // Analizza l'intero albero di sintassi alla ricerca di ottimizzazioni
        ParseTree tree = parser.sourceUnit();
//        printParseTree(tree, parser);
        findAdditionOptimizations(tree);
        findDivisionByPowerOfTwoOptimizations(tree);
        findArrayLengthCachingOptimization(tree);
        findCalldataOptimization(tree);
        findComparisonOptimization(tree);
        findCustomErrorOptimization(tree);
        findDataTypeOptimization(tree);
        optimizeAssignmentStatements(tree);
        suggestLoopOptimization(tree);
        suggestNestedIfOptimization(tree);
        suggestStateVariableOrderOptimization(tree);
        suggestPublicExternalOptimization(tree);
        suggestRedundantCheckOptimization(tree);
    }

    private void printParseTree(ParseTree tree, SolidityParser parser) {
        // Crea un rappresentazione testuale dell'albero sintattico
        String treeRepresentation = tree.toStringTree(parser);
        System.out.println("Albero Sintattico:");
        System.out.println(treeRepresentation);
    }


    private void findAdditionOptimizations(ParseTree tree) {
        int gas = 50;
        int type = 1;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void exitExpression(SolidityParser.ExpressionContext ctx) {
                // Verifica se l'espressione rappresenta un'operazione di somma con `+=`
                if (ctx.operatoriAssegnazione() != null && ctx.operatoriAssegnazione().getText().equals("+=")) {
                    // Ottieni la riga dove si trova l'ottimizzazione
                    int line = ctx.start.getLine();
                    String optimizationSuggestion = "Sostituire `number += value` con `number = number + value`";

                    // Scrivi l'ottimizzazione rilevata nel file CSV
                    writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                }
                if (ctx.operatoriAssegnazione() != null && ctx.operatoriAssegnazione().getText().equals("-=")) {
                    // Ottieni la riga dove si trova l'ottimizzazione
                    int line = ctx.start.getLine();
                    String optimizationSuggestion = "Sostituire `number -= value` con `number = number - value`";

                    // Scrivi l'ottimizzazione rilevata nel file CSV
                    writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                }
                if (ctx.operatoriAssegnazione() != null && ctx.operatoriAssegnazione().getText().equals("*=")) {
                    // Ottieni la riga dove si trova l'ottimizzazione
                    int line = ctx.start.getLine();
                    String optimizationSuggestion = "Sostituire `number *= value` con `number = number * value`";

                    // Scrivi l'ottimizzazione rilevata nel file CSV
                    writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                }
                if (ctx.operatoriAssegnazione() != null && ctx.operatoriAssegnazione().getText().equals("/=")) {
                    // Ottieni la riga dove si trova l'ottimizzazione
                    int line = ctx.start.getLine();
                    String optimizationSuggestion = "Sostituire `number /= value` con `number = number / value`";

                    // Scrivi l'ottimizzazione rilevata nel file CSV
                    writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                }
                if (ctx.operatoriAssegnazione() != null && ctx.operatoriAssegnazione().getText().equals("%=")) {
                    // Ottieni la riga dove si trova l'ottimizzazione
                    int line = ctx.start.getLine();
                    String optimizationSuggestion = "Sostituire `number %= value` con `number = number % value`";

                    // Scrivi l'ottimizzazione rilevata nel file CSV
                    writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                }

            }
        }, tree);
    }


    private void findDivisionByPowerOfTwoOptimizations(ParseTree tree) {
        int gas = 90;
        int type = 2;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void exitExpression(SolidityParser.ExpressionContext ctx) {
                // Verifica se l'espressione rappresenta un'operazione di divisione
                if (ctx.operatoriMoltiplicazione() != null && ctx.operatoriMoltiplicazione().getText().equals("/")) {
                    if (ctx.expression(1) != null && ctx.expression(1).getText().matches("2|4|8|16|32|64|128|256")) {
                        int divisor = Integer.parseInt(ctx.expression(1).getText());
                        int shiftAmount = (int) (Math.log(divisor) / Math.log(2)); // Calcola il numero di shift

                        // Ottieni la riga dove si trova l'ottimizzazione
                        int line = ctx.start.getLine();
                        String optimizationSuggestion = String.format("Sostituire `number / %d` con `number >> %d`", divisor, shiftAmount);

                        // Scrivi l'ottimizzazione rilevata nel file CSV
                        writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                    }
                }
            }
        }, tree);
    }

    private void findArrayLengthCachingOptimization(ParseTree tree) {
        int gas = 510;
        int type = 3;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void exitExpression(SolidityParser.ExpressionContext ctx) {
                // Controlla se il ciclo accede ripetutamente a .length di un array
                if (ctx.expression(1) != null) {
                    String exprText = ctx.expression(1).getText();

                    // Verifica se l'espressione contiene l'accesso a .length di un array
                    if (exprText != null && exprText.contains(".length")) {
                        String[] parts = exprText.split("\\.");
                        if (parts.length > 1) {
                            // Ottieni il nome dell'array (prima di .length)
                            String arrayName = parts[0];

                            // Verifica se il nome dell'array è stato utilizzato più volte nel ciclo
                            if (exprText.matches(".*" + Pattern.quote(arrayName + ".length") + ".*")) {
                                int line = ctx.start.getLine();
                                String optimizationSuggestion = String.format("Sostituire l'accesso ripetuto a `%s.length` con una variabile locale", arrayName);
                                writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                            }
                        }
                    }
                }
            }
        }, tree);
    }



    private void findCalldataOptimization(ParseTree tree) {
        int gas = 20;
        int type = 4;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void exitParametro(SolidityParser.ParametroContext ctx) {
                // Controlla se il parametro è un array definito come `memory`
                if (ctx.tipoStorage() != null && ctx.tipoStorage().getText().equals("memory")) {
                    if (ctx.nomeTipo() != null && ctx.nomeTipo().getText().contains("[]")) {
                        // Ottieni la riga dove si trova l'ottimizzazione
                        int line = ctx.start.getLine();
                        String optimizationSuggestion = "Considerare di sostituire `memory` con `calldata` per l'array in ingresso se non è modificato";

                        // Scrivi l'ottimizzazione rilevata nel file CSV
                        writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                    }
                }
            }
        }, tree);
    }


    private void findComparisonOptimization(ParseTree tree) {
        int gas1 = 10;
        int gas2 = 30;
        int type = 5;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void exitExpression(SolidityParser.ExpressionContext ctx) {
                // Verifica se l'espressione contiene un confronto
                if (ctx.children != null && ctx.children.size() == 3) { // Tipico per espressioni binarie
                    String left = ctx.children.get(0).getText(); // Parte sinistra
                    String operator = ctx.children.get(1).getText(); // Operatore
                    String right = ctx.children.get(2).getText(); // Parte destra
                    // Confronto con `!= 0`
                    if ("!=".equals(operator) && "0".equals(right)) {
                        int line = ctx.start.getLine();
                        String suggestion = "Considerare di sostituire `number != 0` con `number > 0` se il numero è garantito positivo.";
                        writeOptimizationToCSV(line, suggestion, gas1, type);
                    }
                    // Confronto con `> 0`
                    if (">".equals(operator) && "0".equals(right)) {
                        int line = ctx.start.getLine();
                        String suggestion = "Considerare di sostituire `number > 0` con `number != 0` se il valore può essere sia positivo che negativo.";
                        writeOptimizationToCSV(line, suggestion, gas2, type);
                    }
                }
            }
        }, tree);
    }


    private void findCustomErrorOptimization(ParseTree tree) {
        int gas = 30;
        int type = 6;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void enterExpression(SolidityParser.ExpressionContext ctx) {
                // Cerca espressioni che iniziano con "require" e contengono un messaggio di errore
                String expressionText = ctx.getText();
                if (expressionText.startsWith("require") && expressionText.contains("\"")) {
                    int line = ctx.start.getLine();
                    String suggestion = "Considerare di sostituire la stringa di errore in `require` con un errore personalizzato per ottimizzare i costi del gas.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        }, tree);
    }


    private void findDataTypeOptimization(ParseTree tree) {
        int gas = 10520;
        int type = 7;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void enterDichiarazioneVariabile(SolidityParser.DichiarazioneVariabileContext ctx) {
                // Ottieni il testo della dichiarazione
                String declarationText = ctx.getText();

                // Controlla se è presente un tipo di dato `uint8` o `uint256`
                if (declarationText.contains("uint8")) {
                    int line = ctx.start.getLine();
                    String suggestion = "Considerare di sostituire `uint8` con `uint256` per evitare problemi di overflow se i valori possono eccedere il limite di 255.";
                    writeOptimizationToCSV(line, suggestion, 0, type);
                } else if (declarationText.contains("uint256")) {
                    int line = ctx.start.getLine();
                    String suggestion = "Considerare di sostituire `uint256` con un tipo più piccolo, come `uint8` o `uint16`, per ridurre i costi del gas se i valori rimangono bassi.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        }, tree);
    }



    private void optimizeAssignmentStatements(ParseTree tree) {
        int gas =9830;
        int type = 8;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void enterExpression(SolidityParser.ExpressionContext ctx) {
                // Verifica se si tratta di un'assegnazione
                if (ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("=")) {
                    String left = ctx.getChild(0).getText(); // Parte sinistra dell'assegnazione
                    ParseTree rightNode = ctx.getChild(2);  // Parte destra dell'assegnazione
                    String right = rightNode.getText(); // Testo della parte destra
                    int line = ctx.start.getLine(); // Linea del codice sorgente

                    // Caso: assegnazione inutile `x = x;`
                    if (left.equals(right)) {
                        String suggestion = "Rimuovere l'assegnazione inutile `" + left + " = " + right + "`.";
                        writeOptimizationToCSV(line, suggestion, gas, type);
                    }

                    // Analizza i dettagli dell'espressione a destra
                    if (rightNode.getChildCount() == 3) {
                        String operand1 = rightNode.getChild(0).getText(); // Primo operando
                        String operator = rightNode.getChild(1).getText(); // Operatore
                        String operand2 = rightNode.getChild(2).getText(); // Secondo operando

                        // Caso: assegnazione ridondante `x = x + 0;`
                        if (operand1.equals(left) && operator.equals("+") && operand2.equals("0")) {
                            String suggestion = "Semplificare l'assegnazione `" + left + " = " + right + "` in `" + left + "`.";
                            writeOptimizationToCSV(line, suggestion, gas, type);
                        }

                        if (operand1.equals(left) && operator.equals("-") && operand2.equals("0")) {
                            String suggestion = "Semplificare l'assegnazione `" + left + " = " + right + "` in `" + left + "`.";
                            writeOptimizationToCSV(line, suggestion, gas, type);
                        }

                        // Caso: assegnazione ridondante `x = x * 1;`
                        if (operand1.equals(left) && operator.equals("*") && operand2.equals("1")) {
                            String suggestion = "Semplificare l'assegnazione `" + left + " = " + right + "` in `" + left + "`.";
                            writeOptimizationToCSV(line, suggestion, gas, type);
                        }

                        if (operand1.equals(left) && operator.equals("/") && operand2.equals("1")) {
                            String suggestion = "Semplificare l'assegnazione `" + left + " = " + right + "` in `" + left + "`.";
                            writeOptimizationToCSV(line, suggestion, gas, type);
                        }

                        if (operand1.equals(left) && operator.equals("%") && operand2.equals("1")) {
                            String suggestion = "Semplificare l'assegnazione `" + left + " = " + right + "` in `" + left + "`.";
                            writeOptimizationToCSV(line, suggestion, gas, type);
                        }

                    }
                }
            }
        }, tree);
    }


    private void suggestLoopOptimization(ParseTree tree) {
        int gas =750;
        int type = 9;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void enterForStatement(SolidityParser.ForStatementContext ctx) {
                // Cerca cicli `for` con incrementi semplici come `i++`
                if (ctx.getText().contains("++") && !ctx.getText().contains("unchecked")) {
                    SolidityParser.ExpressionContext incrementExpr = ctx.expression();
                    String incrementText = incrementExpr.getText();
                    String[] parts = incrementText.split("\\+\\+"); // Dividi su `++`
                    String varName = parts[0].trim();
                    int line = ctx.start.getLine();
                    String suggestion = "Considerare l'uso di `unchecked` per l'incremento di `"+varName+"++` in un ciclo `for` per ridurre i costi del gas.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        }, tree);
    }

    private void suggestNestedIfOptimization(ParseTree tree) {
        int gas = 60;
        int type = 10;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void enterIfStatement(SolidityParser.IfStatementContext ctx) {
                // Ottieni il testo della condizione
                String conditionText = ctx.expression().getText();

                // Controlla se ci sono operatori logici `&&`
                if (conditionText.contains("&&")) {
                    int line = ctx.start.getLine();
                    String suggestion = "Considera di sostituire la condizione complessa nel `if` con un set di `if` annidati per migliorare la leggibilità e il consumo di gas.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        }, tree);
    }

    private void suggestStateVariableOrderOptimization(ParseTree tree) {
        int gas = 22230;
        int type = 11;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void enterDefinizioneContratto(SolidityParser.DefinizioneContrattoContext ctx) {
                List<String> variableTypes = new ArrayList<>();
                boolean needsOptimization = false;

                for (SolidityParser.ParteDiContrattoContext partCtx : ctx.parteDiContratto()) {
                    if (partCtx.assegnazioneVariabile() != null) {
                        String varType = partCtx.assegnazioneVariabile().nomeTipo().getText();
                        variableTypes.add(varType);
                    }
                }

                // Verifica se le variabili sono dichiarate in ordine ottimale
                for (int i = 0; i < variableTypes.size() - 1; i++) {
                    String currentType = variableTypes.get(i);
                    String nextType = variableTypes.get(i + 1);

                    //Verifica se una variabile più grande precede una più piccola
                    if ((currentType.contains("uint256") && nextType.contains("uint8")) ||
                            (currentType.contains("uint256") && nextType.contains("uint16")) ||
                            (currentType.contains("uint128") && nextType.contains("uint8"))) {
                        needsOptimization = true;
                        break;
                    }
                }

                if (needsOptimization) {
                    int line = ctx.start.getLine();
                    String suggestion = "Considera di ordinare le variabili di stato per ridurre i costi di storage, raggruppando tipi più piccoli consecutivamente.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        }, tree);
    }


    private void suggestPublicExternalOptimization(ParseTree tree) {
        int gas = 55;
        int type = 12;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void enterDefinizioneFunzione(SolidityParser.DefinizioneFunzioneContext ctx) {
                // Verifica se la funzione è dichiarata come `public`
                if (ctx.identificatore() != null && ctx.identificatore().getText().equals("returnPublic")) {
                    // Suggerisci di cambiare in `external` se la funzione non è chiamata internamente
                    int line = ctx.start.getLine();
                    String suggestion = "La funzione  è dichiarata `public` ma potrebbe essere dichiarata `external` per ridurre i costi di gas.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        }, tree);
    }

    private void suggestRedundantCheckOptimization(ParseTree tree) {
        int gas = 30;
        int type = 13;
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityBaseListener() {
            @Override
            public void enterDefinizioneFunzione(SolidityParser.DefinizioneFunzioneContext ctx) {
                // Cerca la presenza di un `require` seguito da un controllo `if` con la stessa condizione
                String functionBody = ctx.getText(); // Ottieni il corpo della funzione come stringa
                if (functionBody.contains("require") && functionBody.contains("if")) {

                    // Estrai la condizione di `require` tra parentesi
                    String requireCondition = extractCondition(functionBody, "require");

                    // Estrai la condizione di `if` tra parentesi
                    String ifCondition = extractCondition(functionBody, "if");
                    // Controlla se le condizioni sono uguali
                    if (requireCondition.equals(ifCondition)) {
                        int line = ctx.start.getLine();
                        String suggestion = "Rimuovi il controllo ridondante `if`, la condizione è già verificata da `require`.";
                        writeOptimizationToCSV(line, suggestion, gas, type);
                    }
                }
            }

            // Metodo per estrarre la condizione tra parentesi di require o if
            private String extractCondition(String functionBody, String keyword) {
                int keywordIndex = functionBody.indexOf(keyword);
                if (keywordIndex == -1) {
                    return ""; // Se non trovata, ritorna una stringa vuota
                }
                int startIndex = functionBody.indexOf("(", keywordIndex) + 1; // Trova l'inizio della condizione
                int endIndex = functionBody.indexOf(")", startIndex); // Trova la fine della condizione
                return functionBody.substring(startIndex, endIndex).trim(); // Restituisce la condizione tra parentesi
            }
        }, tree);
    }





    private void writeOptimizationToCSV(int line, String optimizationSuggestion, int gas, int type) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName, true))) {
            String[] record = { String.valueOf(line), optimizationSuggestion, String.valueOf(gas), String.valueOf(type)};
            writer.writeNext(record);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initializeCSV() {
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {
            writer.writeNext(new String[] { "Riga", "Ottimizzazione", "Gas" , "Tipo"});
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
