import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Codice Solidity di esempio su cui fare l'analisi
        String tuoCodiceSolidity = """
            pragma solidity >= 0.8.7;

            contract Addition {
                uint256 public number = 1;

                function addition(uint256 value) public {
                    number += value;  // esempio di ottimizzazione
                }

                function additionOptimized(uint256 value) public {
                    number = number + value; // esempio di ottimizzazione
                }
            }
            """;

        // Crea il lexer e il parser
        SolidityLexer lexer = new SolidityLexer(CharStreams.fromString(tuoCodiceSolidity));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);

        // Crea l'ottimizzatore e avvia l'analisi
        SolidityOptimizer optimizer = new SolidityOptimizer(parser);
        optimizer.analyzeAndOptimize();

        // Stampa i log delle ottimizzazioni trovate
        List<String> optimizationLogs = optimizer.getOptimizationLogs();
        if (optimizationLogs.isEmpty()) {
            System.out.println("Nessuna ottimizzazione trovata.");
        } else {
            System.out.println("Suggerimenti di ottimizzazione trovati:");
            for (String log : optimizationLogs) {
                System.out.println(log);
            }
        }
    }
}
