
package textverarbeitung2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 *
 * @author Sarah
 */
public class Textvergleicher {
    private final String TRENNZEICHEN = ",.:;()-!? ";
    
    public Textvergleicher() {
        
    }
    
    public boolean sindGleich(Reader r1, Reader r2) throws IOException {
        
        boolean gleich = true;
        // Reader einlesen
        BufferedReader reader1 = new BufferedReader(r1);
        BufferedReader reader2 = new BufferedReader(r2);
        // Zeilen an String übergeben
        String zeile1 = reader1.readLine();
        String zeile2 = reader2.readLine();
        
        
        while (zeile1 != null & zeile2 != null) {
            // Wörter vom String trennen
            StringTokenizer token1 = new StringTokenizer(zeile1, TRENNZEICHEN);
            StringTokenizer token2 = new StringTokenizer(zeile2, TRENNZEICHEN);
            
            while (token1.hasMoreTokens() && token2.hasMoreTokens()) {
                String wort1 = token1.nextToken();
                String wort2 = token2.nextToken();
                
                if (!(wort1.equals(wort2))) {
                    gleich = false;
                }
            }
            zeile1 = reader1.readLine();
            zeile2 = reader2.readLine();
        }
        
        // falscher Lösungsansatz
        /*
        char[] puffer1 = new char[10];
        char[] puffer2 = new char[10];
        int stream1 = r1.read(puffer1);
        int stream2 = r2.read(puffer2);
        
        while (stream1 != -1 && stream2 != 1) {
            for (int i = 0; i < 10; i++) {
                if (puffer1[i] != puffer2[i]) {
                    gleich = false;
                }
                
                stream1 = r1.read(puffer1);
                stream2 = r2.read(puffer2);
            }
        }
*/
        
        return gleich;
    }
}
