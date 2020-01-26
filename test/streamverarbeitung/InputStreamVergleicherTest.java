
package streamverarbeitung;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah Grugiel
 */
public class InputStreamVergleicherTest {
    InputStreamVergleicher isv;
    InputStream data1;
    InputStream data2;
    InputStream data3;
    InputStream data4;
    InputStream data5;
    
    @Before
    public void setUp() {
        isv = new InputStreamVergleicher();
        data1 = new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5, 6, 7});
        data2 = new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5, 6, 7});
        data3 = new ByteArrayInputStream(new byte[]{9, 8, 7, 6, 5, 4, 3});
        data4 = new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5});
        data5 = new ByteArrayInputStream(new byte[]{6, 2, 3, 4, 5});
        
    }
    
    @Test
    public void gleicheLaengeGleicheBytes() throws IOException {
        assertEquals(true, isv.sindGleich(data1, data2, 6));
    }
    
    @Test
    public void unterschiedlicheLaengeGleicheBytes() throws IOException {
        assertEquals(true, isv.sindGleich(data1, data4, 3));
    }
    
    @Test
    public void gleicheLaengeUnterschiedlicheBytes() throws IOException {
        assertEquals(false, isv.sindGleich(data1, data3, 6));
    }
    
    @Test
    public void unterschiedlicheLaengeUnterschiedlicheBytes() throws IOException {
        assertEquals(false, isv.sindGleich(data1, data5, 3));
    }
}
