
package carsharing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah Grugiel
 */
public class BuchungTest {
    Buchung b1;
    Buchung b2;
    Buchung b3;
    
    @Before
    public void setUp() {
        b1 = new Buchung("2019/03/21 10:00", "2019/03/23 15:00");
    }
    
    @Test
    public void istAusgebucht() {
        assertEquals(false, b1.istVerfuegbar("2019/03/22 16:00", "2019/03/22 19:00"));
        assertEquals(false, b1.istVerfuegbar("2019/03/20 16:00", "2019/03/21 19:00"));
        assertEquals(false, b1.istVerfuegbar("2019/03/21 08:00", "2019/03/21 11:00"));
    }
 
    @Test
    public void istBuchbar() {
        assertEquals(true, b1.istVerfuegbar("2019/03/25 12:00", "2019/03/28 12:00"));
        assertEquals(true, b1.istVerfuegbar("2019/03/21 08:00", "2019/03/21 09:00"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
