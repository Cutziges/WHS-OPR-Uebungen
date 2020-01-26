
package textverarbeitung2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 *
 * @author Sarah
 */
public class Textverarbeiter {
    private final String TRENNZEICHEN = ".,:;!?-()";
    private Wortverarbeiter verarbeiter;
    
    public Textverarbeiter(Wortverarbeiter wv) {
        this.verarbeiter = wv;
    }
    
    public void verarbeite(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);
        String zeile = reader.readLine();
        StringTokenizer tokenizer;
        
        while (zeile != null) {
            tokenizer = new StringTokenizer(zeile, TRENNZEICHEN);
            
            while (tokenizer.hasMoreTokens()) {
                this.verarbeiter.verarbeite(tokenizer.nextToken());
            }
            
            zeile = reader.readLine();
            this.verarbeiter.verarbeiteZeilenende();
        }
    }
}
