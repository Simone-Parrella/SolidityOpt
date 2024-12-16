package grammar;

import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
public class Main2 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\simon\\Documents\\GitHub\\SolidityProject\\Solidity\\src\\main\\java\\grammar\\Test.sol";
        String outputCSV = "optimizations.csv";

        try {
            // Carica il file di input
            InputStream fileStream = new FileInputStream(filePath);
            CharStream input = CharStreams.fromStream(fileStream);

            // Crea il lexer e il parser di ANTLR
            SolidityLexer lexer = new SolidityLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SolidityParser parser = new SolidityParser(tokens);

            // Inizializza l'ottimizzatore e il file CSV
            SolidityOptimizer optimizer = new SolidityOptimizer(parser, outputCSV);
            optimizer.initializeCSV();

            // Esegue l'analisi e l'ottimizzazione
            optimizer.analyzeAndOptimize();

            System.out.println("Ottimizzazione completata. I risultati sono stati salvati in: " + outputCSV);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
