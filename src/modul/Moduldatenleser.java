
package modul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Sarah Grugiel
 * 9 Modulverwaltung
 */
public class Moduldatenleser {
    private Modulverwaltung verwaltung;
    public static final String TRENNZEICHEN = ";";
    public static final String TRENNZEICHEN2 = ",";
    
    public void lies(Reader r, Modulverwaltung mv) throws IOException {
        BufferedReader reader = new BufferedReader(r);
        StringTokenizer tokenizer;
        StringTokenizer tokenizer2;
        String zeile = reader.readLine();
        String[] woerter = new String[3];
        
        /**
         * Einlesen.
         */
        while (zeile != null) {
            tokenizer = new StringTokenizer(zeile, TRENNZEICHEN);
            
            while (tokenizer.hasMoreTokens()) {
                for (int i = 0; i < woerter.length; i++) {
                    woerter[i] = tokenizer.nextToken();
                }
            }
        }
        
        /**
         * Studiengänge aufspalten und abspeichern.
         */
        ArrayList<String> studiengaenge = new ArrayList<>();
        tokenizer2 = new StringTokenizer(woerter[2], TRENNZEICHEN2);
        
        while (tokenizer2.hasMoreTokens()) {
            studiengaenge.add(tokenizer2.nextToken());
        }
        
        /**
         * Objekt erzeugen.
         */
        Modul m = new Modul(woerter[0], woerter[1]);
        
        while(!studiengaenge.isEmpty()) {
            for (int i = 0; i < studiengaenge.size(); i++) {
                
                m.fuegeHinzu(studiengaenge.get(i));
            }
        }
    }
}
