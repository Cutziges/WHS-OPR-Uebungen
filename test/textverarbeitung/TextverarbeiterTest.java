
package textverarbeitung;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Mockup Klasse.
 * @author Sarah Grugiel
 */
class FakeVerarbeiter implements Wortverarbeiter {
    ArrayList<String> woerter;
    int index;
    
    public FakeVerarbeiter () {
        index = 1;
        woerter = new ArrayList<>();
    }

    @Override
    public void verarbeite(String wort) {
        woerter.add(wort);
    }

    @Override
    public void verarbeiteZeilenende() {
        index++;
    }
    
}

/**
 *
 * @author Sarah Grugiel
 */
public class TextverarbeiterTest {
    Textverarbeiter verarbeiter;
    FakeVerarbeiter fake;
    Indexierer index;
    ArrayList<String> ergebnis;
    ArrayList<String> ausschlussWoerter;
    StringReader reader;
    
    @Before
    public void setUp() {
        ergebnis = new ArrayList<>();
        ausschlussWoerter = new ArrayList<>();
        
        ergebnis.add("Hallo");
        ergebnis.add("wie");
        ergebnis.add("geht");
        ergebnis.add("es");
        ergebnis.add("dir");
        ergebnis.add("und");
        //ergebnis.add("deiner");
        ergebnis.add("Mama");
        ausschlussWoerter.add("und");
    }
    
    @Test
    public void verarbeiteMitFakeTester() throws IOException {
        fake = new FakeVerarbeiter();
        verarbeiter = new Textverarbeiter(fake);
        reader = new StringReader("Hallo, wie geht es dir und deiner Mama?");
        verarbeiter.verarbeite(reader);
        
        assertEquals(2, fake.index);
        assertEquals(ergebnis, fake.woerter);
    }
}
