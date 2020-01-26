
package enumeration;

import enumerations.Laengeneinheit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sarah
 */
public class LaengeneinheitTest {
    @Test
    public void testeMillimeterNormal() {
        assertEquals(100000d, Laengeneinheit.KM.mm());
    }
}
