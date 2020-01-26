
package carsharing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Sarah Grugiel
 */
public class Fahrzeugmanager {
    private final ArrayList<Fahrzeug> fahrzeuge;
    
    /**
     * Erzeugt ein Objekt dieser Klasse.
     * Ein gerade erzeugter Fahrzeugmanager verwaltet anfangs keine Fahrzeuge.
     */
    public Fahrzeugmanager() {
        fahrzeuge = new ArrayList<>();
    }
    
    /**
     * Fügt der ArrayListe ein neues Fahrzeug hinzu.
     * @param name Fahrzeugname
     * @param standort Fester Standort des Fahrzeugs
     */
    public void fuegeFahrzeugHinzu(String name, String standort) {
        fahrzeuge.add(new Fahrzeug(name, standort));
    }
    
    /**
     * Textausgabe.
     * @return Gibt Name und Standort wieder
     */
    /*
    public String gibText() {
       return (name + " " + standort);
    } */
    
    /**
     * Gibt die Fahrzeugnamen alphabetisch sortiert aus.
     * @return Ausgabe
     */
    public ArrayList<String> gibFahrzeugnamen() {
        ArrayList<String> fahrzeugNamen = new ArrayList<>();
        
        for (Fahrzeug auto : fahrzeuge) {
            fahrzeugNamen.add(auto.getName());
        }
        
        // Die Namensliste sortieren
        Collections.sort(fahrzeugNamen);
        
        System.out.println(Arrays.toString(fahrzeugNamen.toArray()));
        
        return fahrzeugNamen;
    }
    
     /**
     * Gibt die Fahrzeugnamen alphabetisch sortiert aus.
     * @param ort Standort, an dem gesucht werden soll
     * @return Ausgabe
     */
    public ArrayList<String> gibFahrzeugnamen(String ort) {
        ArrayList<String> fahrzeugNamen = new ArrayList<>();
        
        for (Fahrzeug auto : fahrzeuge) {
            if (auto.getStandort().equals(ort)) {
                fahrzeugNamen.add(auto.getName());
            }
        }
        
        // Die Namensliste sortieren
        Collections.sort(fahrzeugNamen);
        
        System.out.println(Arrays.toString(fahrzeugNamen.toArray()));
        
        return fahrzeugNamen;
    }
    
    public ArrayList<String> gibVerfuegbareFahrzeuge(String ort,
            String anfang, String ende) {
        ArrayList<String> verfuegbareFahrzeuge = new ArrayList<>();
        
        for (Fahrzeug auto : fahrzeuge) {
            if (auto.getStandort().equals(ort)
                    && auto.pruefeBuchungen(anfang, ende)) {
                verfuegbareFahrzeuge.add(auto.getName());
            }
        }
        
        // Die Namensliste sortieren
        Collections.sort(verfuegbareFahrzeuge);
        
        System.out.println(Arrays.toString(verfuegbareFahrzeuge.toArray()));
        
        return verfuegbareFahrzeuge;
    }
    
    public boolean bucheFahrzeug(String name, String anfang, String ende) {
        boolean istBuchbar = false;
        Iterator<Fahrzeug> iterator = fahrzeuge.iterator();
        
        while (iterator.hasNext()) {
            Fahrzeug auto = (Fahrzeug) iterator.next();
            
            if (auto.getName().equals(name)) {
                istBuchbar = auto.buchen(anfang, ende);
            }
        }
        
        return istBuchbar;
    }

    /*
    @Override
    public int compareTo(Fahrzeug fahrzeug) {
        return this.name.compareTo(fahrzeug.getName());
    }
/*/
    
}
