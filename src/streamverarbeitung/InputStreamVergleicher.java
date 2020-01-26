
package streamverarbeitung;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

/**
 *
 * @author Sarah Grugiel
 */
public class InputStreamVergleicher {
    
    public InputStreamVergleicher () {
        
    }
    
    public boolean sindGleich(InputStream is1, InputStream is2, long n)
    throws IOException {
        
        byte[] puffer = new byte[10];
        byte[] puffer2 = new byte[10];
        int stream1 = is1.read(puffer);
        int stream2 = is2.read(puffer2);
        
        boolean istGleich = true;
        
        while (stream1 != -1 && stream2 != -1) {
            for (int i = 0; i < n; i++) {
                if (puffer[i] != puffer2[i]) {
                    istGleich = false;
                }
            }
            stream1 = is1.read(puffer);
            stream2 = is2.read(puffer2);
        }
        
        return istGleich;
    }
    
    
    /**
     * Reko Aufgabe zu Streams.
     * @param is übergebener Stream
     * @return Anzahl von unterschiedlichen Bytes
     * @throws IOException Fehlerfall
     */
    public static int gibAnzahlBytes(InputStream is) throws IOException {
        HashSet<Byte> bytes = new HashSet<>();
        byte[] puffer = new byte[10];
        int stream = is.read(puffer);
        int anzahl = 0;
        
        while (stream != -1) {
            for (byte x : puffer) {
                bytes.add(x);
            }
            stream = is.read(puffer);
        }
        anzahl = bytes.size();
        
        return anzahl;
    }
    
    
    public static long quersumme(InputStream is, int n) throws IOException {
        byte[] puffer = new byte[10];
        int stream = is.read(puffer);
        long quersumme = 0;
        
        if (stream < n) {
            throw new RuntimeException("Eingabestrom zu kurz");
        }
        
        while (stream != -1) {
            for (int i = 0; i < n; i++) {
                quersumme = quersumme + puffer[i];
            }
            
            stream = is.read(puffer);
        }
        
        return quersumme;
    }
    
    /**
     * Main-Methode für Debugging.
     * @param args wird nicht genutzt
     * @throws IOException Fehlerzeug
     */
    public static void main(String[] args) throws IOException {
        InputStreamVergleicher isv;
        InputStream data1;
        InputStream data2;
        InputStream data3;
    
        isv = new InputStreamVergleicher();
        data1 = new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5, 6, 7});
        data2 = new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5});
        data3 = new ByteArrayInputStream(new byte[]{1,2,3,4,5,6,7,8,9,10,11,12});
        
        System.out.println("Quersumme: " + quersumme(data1, 3));
        // Fehlerfall: Eingabestrom zu kurz
        System.out.println("Quersumme: " + quersumme(data1, 8));
        
        
        /*
        System.out.println("Anzahl: " + gibAnzahlBytes(data1));
        System.out.println("Anzahl: " + gibAnzahlBytes(data2));
        System.out.println("Anzahl: " + gibAnzahlBytes(data3));
*/
    }
}
