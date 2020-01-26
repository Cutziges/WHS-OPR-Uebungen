
package textverarbeitung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sarah Grugiel
 * 8 Textverarbeiter
 */
public class Indexierer implements Wortverarbeiter {
    private int zeilenindex;
    private HashSet<String> ausschlussWoerter;
    private HashMap<String, HashSet<Integer>> gefundeneWoerter;
    
    public Indexierer(Collection<String> ausschluss) {
        this.zeilenindex = 1;
        this.ausschlussWoerter = new HashSet<>();
        this.gefundeneWoerter = new HashMap<>();
        
        Iterator<String> it = ausschluss.iterator();
        
        while (it.hasNext()) {
            this.ausschlussWoerter.add(it.next());
        }
    }
    
    public List<String> gibWoerter() {
        List<String> woerter = new ArrayList<>(this.gefundeneWoerter.keySet());
        Collections.sort(woerter);
        
        return woerter;
    }
    
    public String gibZeilennummern(String wort) {
        String ausgabe = "";
        
        if (gefundeneWoerter.containsKey(wort)) {
            HashSet<Integer> zeilen = gefundeneWoerter.get(wort);
            
            Iterator<Integer> it = zeilen.iterator();
            
            while (it.hasNext()) {
                ausgabe += "" + it.next();
                
                if (it.hasNext()) {
                    ausgabe += ", ";
                }
            }
        }
        
        return ausgabe;
    }

    @Override
    public void verarbeite(String wort) {
        if (!ausschlussWoerter.contains(wort)) {
            if (gefundeneWoerter.containsKey(wort)) {
                gefundeneWoerter.get(wort).add(zeilenindex);
            } else {
                HashSet<Integer> zeile = new HashSet<>();
                zeile.add(zeilenindex);
                
                gefundeneWoerter.put(wort, zeile);
            }
        }
    }

    @Override
    public void verarbeiteZeilenende() {
        zeilenindex++;
    }
}
