
package punktelinien;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Sarah
 */
public class Linie {
    private Punkt start;
    private Punkt ende;
    
    public Linie (int x1, int y1, int x2, int y2) {
        this.start = new Punkt(x1, y1);
        this.ende = new Punkt(x2, y2);
    }

    public Punkt getStart() {
        return start;
    }

    public Punkt getEnde() {
        return ende;
    }
    
    
    public static HashMap<Punkt, HashSet<Punkt>> 
        gibZuteilungen(List<Linie> linien) {
        HashMap<Punkt, HashSet<Punkt>> zuteilungen = new HashMap<>();
        List<Linie> linie = new ArrayList<>(linien);
            
        for (int i = 0; i < linie.size(); i++) {
            if (!zuteilungen.containsKey(linie.get(i).getStart())) {
                zuteilungen.put(linie.get(i).getStart(), new HashSet<>());
            }
                
            zuteilungen.get(linie.get(i).getStart())
                    .add(linie.get(i).getEnde());
        }
        
        
        zuteilungen.entrySet().forEach((e) -> {
            System.out.println(e.getKey() + " - " + e.getValue());
        });
        
        
        return zuteilungen;
    }
}
