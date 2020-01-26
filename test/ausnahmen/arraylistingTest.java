
package ausnahmen;

import java.io.InputStream;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Sarah Grugiel
 * 6 Ausnahmen Aufgabe 2
 */
public class arraylistingTest {
    ArrayList<Integer> liste;
    
    @Before
    public void setUp() {
        liste = new ArrayList();
        liste.add(5);
        liste.add(2);
    }
    
    @Test
    public void zeigeVierteStelle() {
        int index = 3;
        
        try {
            liste.get(index);
            fail("Irgendwas stimmt nicht mit deinem Test, Brudi!");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index: 3, Size: 2", e.getMessage());
        }
    }
}
