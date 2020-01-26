
package textverarbeitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 *
 * @author Sarah Grugiel
 * 8 Textverarbeitung
 */
public class Textverarbeiter {
    public static final String TRENNZEICHEN = ".,:;!?-() ";
    private Wortverarbeiter verarbeiter;
    
    Textverarbeiter(Wortverarbeiter wv) {
        this.verarbeiter = wv;
    }
    
    public void verarbeite(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);
        StringTokenizer tokenizer;
        String zeile = reader.readLine();
        
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
