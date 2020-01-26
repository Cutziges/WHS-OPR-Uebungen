
package carsharing;

import java.util.ArrayList;

/**
 *
 * @author Sarah Grugiel
 */
public class Buchung {
    /**
     * Buchungsanfang.
     * Zeit im Format JJJJ/MM/TT HH:MM
     */
    private String anfangszeit;
    private String endzeit;
    
    public Buchung (String anfang, String ende) {
        this.anfangszeit = anfang;
        this.endzeit = ende;
    }
    
    public boolean istVerfuegbar (String anfang, String ende) {
        boolean istVerfuegbar = true;
        
        // Buchungszeitraum liegt in anderem Zeitraum
        if (
                anfangszeit.compareTo(anfang) < 0
                && endzeit.compareTo(ende) > 0
                || anfangszeit.compareTo(anfang) > 0
                && anfangszeit.compareTo(ende) < 0
                || anfangszeit.compareTo(anfang) > 0
                && anfangszeit.compareTo(ende) < 0
                || anfangszeit.compareTo(ende) < 0
                && endzeit.compareTo(anfang) > 0
                && endzeit.compareTo(ende) < 0
                || anfangszeit.compareTo(anfang) < 0
                && anfangszeit.compareTo(ende) < 0
                && endzeit.compareTo(anfang) > 0
                || anfangszeit.compareTo(anfang) < 0
                && anfangszeit.compareTo(ende) < 0) {
            istVerfuegbar = false;
        }
        // Buchungszeitraum liegt nach anderem Zeitraum
        if (
                anfangszeit.compareTo(anfang) > 0
                && anfangszeit.compareTo(ende) > 0
                && endzeit.compareTo(anfang) > 0
                && endzeit.compareTo(ende) > 0) {
            istVerfuegbar = true;
        }
        // Buchungszeitraum liegt vor anderem Zeitraum
        if (
                anfangszeit.compareTo(anfang) < 0
                && anfangszeit.compareTo(ende) < 0
                && endzeit.compareTo(anfang) < 0
                && endzeit.compareTo(ende) < 0) {
            istVerfuegbar = true;
        }
        // Buchungszeitraum grenzt an anderem Zeitraum
        if (
                anfangszeit.compareTo(anfang) < 0
                && anfangszeit.compareTo(ende) < 0
                && endzeit.compareTo(anfang) == 0
                && endzeit.compareTo(ende) < 0) {
            istVerfuegbar = true;
        }
        
        return istVerfuegbar;
    }
}
