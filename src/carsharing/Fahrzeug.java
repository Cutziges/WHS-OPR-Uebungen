
package carsharing;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sarah Grugiel
 */
public class Fahrzeug {
    private String name;
    private String standort;
    private final ArrayList<Buchung> buchungen;
    
    /**
     * Erstellt ein neues Fahrzeug.
     * @param name Name des Fahrzeugs
     * @param standort Fester Standort des Fahrzeugs
     */
    public Fahrzeug(String name, String standort) {
        this.name = name;
        this.standort = standort;
        buchungen = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }
    
    public boolean pruefeBuchungen(String anfang, String ende) {
        boolean istBuchbar = false;
        Iterator<Buchung> iterator = buchungen.iterator();
        
        if (buchungen.isEmpty()) {
            istBuchbar = true;
        }
        
        while (iterator.hasNext() && !istBuchbar) {
            Buchung buchung = (Buchung) iterator.next();
            
            istBuchbar = buchung.istVerfuegbar(anfang, ende);
        }
        
        return istBuchbar;
    }
    
    public boolean buchen(String anfang, String ende) {
        boolean wurdeGebucht = pruefeBuchungen(anfang, ende);
        
        if (wurdeGebucht) {
            buchungen.add(new Buchung(anfang, ende));
        }
        
        return wurdeGebucht;
    }
}
