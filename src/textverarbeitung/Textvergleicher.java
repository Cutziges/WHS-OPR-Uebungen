
package textverarbeitung;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Sarah Grugiel
 */
public class Textvergleicher {
    
    public boolean sindGleich(Reader r1, Reader r2) throws IOException {
        char[] cbuf = new char[10];
        char[] cbuf2 = new char[10];
        int stream1 = r1.read(cbuf);
        int stream2 = r2.read(cbuf2);
        
        boolean istGleich = true;
        
        while (stream1 != -1 && stream2 != -1) {
            for (int i = 0; i < 10; i++) {
                if (cbuf[i] != cbuf[i]) {
                    istGleich = false;
                }
            }
            
            stream1 = r1.read(cbuf);
            stream2 = r2.read(cbuf2);
            
        }
        
        return istGleich;
    }
    
}
