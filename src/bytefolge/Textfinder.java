
package bytefolge;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 *
 * @author Sarah Grugiel
 */
public class Textfinder {
    private InputStream stream;
    private int laenge;
    
    public Textfinder(InputStream is, int n) {
        this.stream = is;
        this.laenge = n;
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }
    
    public Set<String> gibWoerter() {
        Set<String> ergebnis = null;
        
        return ergebnis;
    }
    
    public Set<String> findeWoerter(InputStream is, int n) 
    throws IOException {
        Set<String> woerter = null;
        byte[] puffer = new byte[10];
        int s = is.read(puffer);
        
        while(s != -1) {
            
        }
        
        return woerter;
    }
    
}
