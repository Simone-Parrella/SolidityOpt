package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import grammar.SolidityLexer;
import grammar.SolidityParser;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.Arrays;  // Import necessario per Arrays.asList

public class TestSymbolTable {

    public static void main(String[] args) {
        // 1. Creazione di un input di esempio (puoi cambiare questa stringa con il codice che vuoi analizzare)
        String codiceSolidity = "                   pragma solidity >= 0.8.7;\n" +
                "                   \n" +
                "                   contract ArrayLength {\n" +
                "                   \n" +
                "                       uint[] public myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];\n" +
                "                       uint[] public anotherArray = [10, 20, 30, 40, 50];\n" +
                "                   \n" +
                "                       // Caching inefficiente di myArray.length all'interno del ciclo\n" +
                "                       function badCaching() view public {\n" +
                "                           for (uint256 i; i < myArray.length; i++) {\n" +
                "                               i++;\n" +
                "                           }\n" +
                "                       }\n" +
                "                   \n" +
                "                       // Caching inefficiente di anotherArray.length all'interno del ciclo\n" +
                "                       function badCachingTwo() view public {\n" +
                "                           for (uint256 i; i < anotherArray.length; i++) {\n" +
                "                               i++;\n" +
                "                           }\n" +
                "                       }\n" +
                "                   \n" +
                "                       // Ottimizzazione per memorizzare la lunghezza dell'array in una variabile locale\n" +
                "                       function goodCaching() view public {\n" +
                "                           uint256 arrayLength = myArray.length;\n" +
                "                           for (uint256 i; i < arrayLength; i++) {\n" +
                "                               i++;\n" +
                "                           }\n" +
                "                       }\n" +
                "                   }\n" +
                "                   ";

        // 2. Configurazione di ANTLR per l'analisi del codice
        CharStream input = CharStreams.fromString(codiceSolidity);
        SolidityLexer lexer = new SolidityLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);

        // 3. Parsing del codice
        ParseTree tree = parser.sourceUnit(); // Puoi cambiare il punto di inizio a seconda della grammatica

        // 4. Creazione di un oggetto SymbolTable
        SymbolTable symbolTable = new SymbolTable();

        // 5. Ottieni i nomi delle regole grammaticali e convertili in una lista
        List<String> ruleNames = Arrays.asList(parser.getRuleNames());

        // 6. Popola la SymbolTable utilizzando l'albero di parsing
        symbolTable.populateMap(tree, ruleNames);

        // 7. Stampa la SymbolTable
        symbolTable.printTable();
    }
}
