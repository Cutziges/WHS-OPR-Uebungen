
package carsharing;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah Grugiel
 */
public class FahrzeugmanagerTest {
    Fahrzeugmanager f1;
    
    @Before
    public void setUp() {
        f1 = new Fahrzeugmanager();
        f1.fuegeFahrzeugHinzu("Rathaus 1", "Rathaus");
        f1.fuegeFahrzeugHinzu("Bahnhof 1", "Bahnhof");
        f1.fuegeFahrzeugHinzu("Bahnhof 2", "Bahnhof");
        f1.fuegeFahrzeugHinzu("Bahnhof 3", "Bahnhof");
        f1.bucheFahrzeug("Bahnhof 1", "2005/04/14, 20:00", "2005/04/15, 08:00");
        f1.bucheFahrzeug("Bahnhof 1", "2005/04/15, 18:00", "2005/04/16, 00:00");
        f1.bucheFahrzeug("Bahnhof 2", "2005/04/14, 11:00", "2005/04/15, 12:00");
        f1.bucheFahrzeug("Bahnhof 3", "2005/04/15, 10:00", "2005/04/15, 19:00");
    }
    
    @Test
    public void gibFahrzeugnamen() {
        ArrayList<String> sollErgebnis = new ArrayList<>();
        sollErgebnis.add("Bahnhof 1");
        sollErgebnis.add("Bahnhof 2");
        sollErgebnis.add("Bahnhof 3");
        sollErgebnis.add("Rathaus 1");
        
        assertEquals(sollErgebnis, f1.gibFahrzeugnamen());
    }
    
    @Test
    public void gibFahrzeugnamenMitOrtBahnhof() {
        ArrayList<String> sollErgebnis = new ArrayList<>();
        sollErgebnis.add("Bahnhof 1");
        sollErgebnis.add("Bahnhof 2");
        sollErgebnis.add("Bahnhof 3");
        
        assertEquals(sollErgebnis, f1.gibFahrzeugnamen("Bahnhof"));
    }
    
    @Test
    public void gibFahrzeugnamenMitOrtRathaus() {
        ArrayList<String> sollErgebnis = new ArrayList<>();
        sollErgebnis.add("Rathaus 1");
        
        assertEquals(sollErgebnis, f1.gibFahrzeugnamen("Rathaus"));
    }
    
    @Test
    public void gibVerfuegbareFahrzeuge1() {
        ArrayList<String> sollErgebnis = new ArrayList<>();
        
        assertEquals(sollErgebnis, f1.gibVerfuegbareFahrzeuge("Bahnhof", 
                "2005/04/15, 11:30", "2005/04/15, 19:00"));
    }
    
    @Test
    public void gibVerfuegbareFahrzeuge2() {
        ArrayList<String> sollErgebnis = new ArrayList<>();
        sollErgebnis.add("Bahnhof 1");
        sollErgebnis.add("Bahnhof 2");
        
        assertEquals(sollErgebnis, f1.gibVerfuegbareFahrzeuge("Bahnhof", 
                "2005/04/15, 12:00", "2005/04/15, 18:00"));
    }
    
    @Test
    public void gibVerfuegbareFahrzeuge3() {
        ArrayList<String> sollErgebnis = new ArrayList<>();
        sollErgebnis.add("Bahnhof 2");
        sollErgebnis.add("Bahnhof 3");
        
        assertEquals(sollErgebnis, f1.gibVerfuegbareFahrzeuge("Bahnhof", 
                "2005/04/15, 19:15", "2005/04/15, 23:00"));
    }
    
    @Test
    public void bucheFahrzeug1() {
        
        assertEquals(true, f1.bucheFahrzeug("Bahnhof 3", 
                "2005/04/15, 09:00", "2005/04/15, 10:00"));
    }
    
    @Test
    public void bucheFahrzeug2() {
        
        assertEquals(true, f1.bucheFahrzeug("Bahnhof 3", 
                "2005/04/15, 09:00", "2005/04/15, 10:00"));
        assertEquals(false, f1.bucheFahrzeug("Bahnhof 3", 
                "2005/04/15, 09:00", "2005/04/15, 11:00"));
    }
    
    @Test
    public void bucheFahrzeug3() {
        
        assertEquals(false, f1.bucheFahrzeug("Bahnhof 3", 
                "2005/04/15, 11:00", "2005/04/15, 18:00"));
    }
    
    @Test
    public void bucheFahrzeug4() {
        
        assertEquals(false, f1.bucheFahrzeug("Bahnhof 3", 
                "2005/04/15, 18:00", "2005/04/15, 20:00"));
    }
    
    @Test
    public void bucheFahrzeug5() {
        
        assertEquals(true, f1.bucheFahrzeug("Bahnhof 3", 
                "2005/04/15, 19:00", "2005/04/15, 20:00"));
    }
    
    @Test
    public void bucheFahrzeug6() {
        
        assertEquals(true, f1.bucheFahrzeug("Bahnhof 3", 
                "2005/04/15, 19:00", "2005/04/15, 20:00"));
        assertEquals(false, f1.bucheFahrzeug("Bahnhof 3", 
                "2005/04/15, 09:00", "2005/04/15, 20:00"));
    }
}
