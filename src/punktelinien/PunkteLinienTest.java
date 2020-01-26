
package punktelinien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarah
 */
public class PunkteLinienTest {
    
    
    public static void main (String[] args) {
        Linie l1 = new Linie(1, 3, 2, 5);
        Linie l2 = new Linie(2, 5, 13, 17);
        Linie l3 = new Linie(2, 5, 9, 12);
        Linie l4 = new Linie(1, 3, 9, 12);
        List<Linie> linien = new ArrayList<>();
        
        linien.add(l1);
        linien.add(l2);
        linien.add(l3);
        linien.add(l4);
        
        System.out.println("Zuteilungen");
        l1.gibZuteilungen(linien);
    }
    
}
