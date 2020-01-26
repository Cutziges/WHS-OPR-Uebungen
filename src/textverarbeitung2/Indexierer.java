
package textverarbeitung2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sarah
 */
public class Indexierer implements Wortverarbeiter {
    private int zeilenindex;
    private HashSet<String> ausschlussWoerter;
    private HashMap<String, HashSet<Integer>> gefundeneWoerter;
    
    public Indexierer(Collection<String> woerter) {
        this.zeilenindex = 1;
        this.ausschlussWoerter = new HashSet<>();
        this.gefundeneWoerter = new HashMap<>();
        
        Iterator<String> i = woerter.iterator();
        
        while (i.hasNext()) {
            this.ausschlussWoerter.add(i.next());
        }
    }
    
    public List<String> gibWoerter() {
        List<String> woerter = new ArrayList<>(this.gefundeneWoerter.keySet());
        Collections.sort(woerter);
        
        return woerter;
    }
    
    public String gibZeilennummern(String wort) {
        String ausgabe = "";
        
        if (this.gefundeneWoerter.containsKey(wort)) {
            // Werte/Values in neues HashSet überschreiben
            HashSet<Integer> zeilen = gefundeneWoerter.get(wort);
            Iterator<Integer> i = zeilen.iterator();
            
            while (i.hasNext()) {
                ausgabe += "" + i.next();
                
                if (i.hasNext()) {
                    ausgabe += ", ";
                }
            }
        }
        
        
        return ausgabe;
    }

    @Override
    public void verarbeite(String wort) {
        if (!ausschlussWoerter.contains(wort)) {
            // falls Wort bereits vorhanden ist den neuen Zeilenindex hinzufügen
            if (gefundeneWoerter.containsKey(wort)) {
                gefundeneWoerter.get(wort).add(zeilenindex);
            } else {
                // falls neues Wort: neues HashSet für Zeilenindixes
                HashSet<Integer> zeile = new HashSet<>();
                zeile.add(zeilenindex);
                // Wort und Zeilenindex einfügen
                gefundeneWoerter.put(wort, zeile);
            }
        } else {
            // wenn Wort zu den Ausschlusswörtern gehört
            System.out.println("Wort darf nicht vorkommen!");
        }
    }

    @Override
    public void verarbeiteZeilenende() {
        zeilenindex++;
    }
}
