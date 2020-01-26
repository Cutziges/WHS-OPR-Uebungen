
package uhrzeiten;

/**
 *
 * @author Sarah
 */
public class ZeitspanneTest {
    public static void main (String[] args) {
        Zeitspanne z1 = new Zeitspanne(2,17,10);
        Zeitspanne z2 = new Zeitspanne(0,135,130);
        Zeitspanne z3 = new Zeitspanne(1,33,7);
        
        System.out.println(z1.equals(z2));
        System.out.println(z1.equals(z3));
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
    }
    
}
