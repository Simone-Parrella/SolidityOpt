import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

public class SolidityOptimizer {
    private final SolidityParser parser;
    private final List<String> optimizationLogs;

    public SolidityOptimizer(SolidityParser parser) {
        this.parser = parser;
        this.optimizationLogs = new ArrayList<>();
    }

    // Metodo principale che inizia l'analisi del codice
    public void analyzeAndOptimize() {
        ParseTree tree = parser.sourceUnit(); // Punto di partenza dell'albero sintattico
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SolidityOptimizationListener(), tree);
    }

    // Listener per rilevare pattern specifici di ottimizzazione
    private class SolidityOptimizationListener extends SolidityBaseListener {

        @Override
        public void enterExpression(SolidityParser.ExpressionContext ctx) {
            // Verifica se l'espressione contiene un operatore +=
            if (ctx.operatoriAssegnazione() != null && ctx.operatoriAssegnazione().getText().equals("+=")) {
                // Estrae il testo e aggiunge un suggerimento di ottimizzazione al log
                String variableName = ctx.expression(0).getText(); // Es: "number" in "number += value"
                String suggestion = "Ottimizzazione suggerita: cambia '" + variableName + " += valore' in '" 
                                    + variableName + " = " + variableName + " + valore' per migliorare le performance.";
                optimizationLogs.add(suggestion);
            }
        }
    }

    // Metodo per ottenere i log delle ottimizzazioni
    public List<String> getOptimizationLogs() {
        return optimizationLogs;
    }
}
