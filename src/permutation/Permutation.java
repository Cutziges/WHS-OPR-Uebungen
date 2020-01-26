
package permutation;

/**
 *
 * @author Sarah Grugiel
 */
public class Permutation {
    /**
     * Zahl.
     */
    private final int n;
    
    /**
     * String/Ausgabe.
     */
    private String s;
    
    /**
     * Zahlen als Folge von 0 bis n - 1.
     */
    private int[] zahlen;
    
    /**
     * Konstruktur, der Zahl als Folge in Array übergibt.
     * @param n Zahl
     */
    public Permutation(int n) {
        this.n = n;
        this.zahlen = new int[n];
        
        for (int i = 0; i < n; i++) {
            zahlen[i] = i;
        }
    }
    
    
    public boolean naechstePermutation() {
        boolean permutationen = true;
        
        return permutationen;
    }
    
    
    /**
     * Magic Methode.
     * @param n Zahl
     * @param zahlen Zahlenarray
     * @return Ergebnisarray mit permutierten Zahlen
     */
    public int[] permutiereDenKram(int n, int[] zahlen) {
        int[] ergebnis = zahlen;
        
        if (n != 1) {
            for (int i = 0; i < n - 1; i++) {
                permutiereDenKram(n - 1, zahlen);
                if (n % 2 == 0) {
                    wechsel(zahlen, i, n - 1);
                } else {
                    wechsel(zahlen, 0, n - 1);
                }
            }
        }
        
        return ergebnis;
    }
    
    
    /**
     * Hilfsmethode zum drehen.
     * @param array Zahlenarray
     * @param a Zahl 1
     * @param b Zahl 2
     */
    private void wechsel(int[] array, int a, int b) {
        int hilfs = array[a];
        array[a] = array[b];
        array[b] = hilfs;
    }
    
    /**
     * Ausgabe der Permutation.
     * @return String
     */
    public String gibAlsText() {
        String s = "";
        
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i] + "-");
        }
        
        return s;
    }
    
}
