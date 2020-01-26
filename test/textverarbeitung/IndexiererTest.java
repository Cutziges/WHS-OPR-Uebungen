
package textverarbeitung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah Grugiel
 */
public class IndexiererTest {
    HashSet<String> ausschluss;
    Indexierer index;
    
    @Before
    public void setUp() {
        ausschluss = new HashSet<>();
        
        ausschluss.add("und");
        ausschluss.add("oder");
        ausschluss.add("Kuba");
        
        index = new Indexierer(ausschluss);
    }
    
    @Test
    public void gibWoerter() {
        ArrayList<String> ergebnis = new ArrayList<>();
        
        index.verarbeite("Hallo");
        index.verarbeite("Blah");
        index.verarbeite("und");
        index.verarbeite("Haus");
        index.verarbeite("Baum");
        index.verarbeite("Katze");
        
        ergebnis.add("Hallo");
        ergebnis.add("Blah");
        ergebnis.add("Haus");
        ergebnis.add("Baum");
        ergebnis.add("Katze");
        Collections.sort(ergebnis);
        
        assertEquals(ergebnis, index.gibWoerter());
    }
    
    @Test
    public void gibZeilen() {
        ArrayList<String> ergebnis = new ArrayList<>();
        
        index.verarbeite("Hallo");
        index.verarbeite("Blah");
        index.verarbeite("und");
        index.verarbeite("Haus");
        index.verarbeite("Baum");
        index.verarbeite("Katze");
        index.verarbeiteZeilenende();
        index.verarbeite("Haus");
        
        assertEquals("1, 2", index.gibZeilennummern("Haus"));
    }
}
