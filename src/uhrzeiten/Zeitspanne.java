
package uhrzeiten;

/**
 *
 * @author Sarah
 */
public class Zeitspanne {
    private final int stunden;
    private final int minuten;
    private final int sekunden;
    
    /**
    * Erzeugt ein Objekt dieser Klasse. Die Parameter dürfen nicht negativ sind.
    */
    public Zeitspanne(int stunden, int minuten, int sekunden) {
        this.stunden = stunden;
        this.minuten = minuten;
        this.sekunden = sekunden;
    }
    
    @Override
    public String toString() {
        int neueStunden;
        int neueMinuten;
        int neueSekunden;
        int gesamtSekunden;
        
        gesamtSekunden = this.sekunden + (this.minuten * 60)
                    + (this.stunden * 3600);
        
        neueStunden = gesamtSekunden / 60 / 60 % 24;
        neueMinuten = gesamtSekunden / 60 % 60;
        neueSekunden = gesamtSekunden % 60;
        
        return (neueStunden + ":" + neueMinuten 
                + ":" + neueSekunden);
    }
    
    @Override
    public boolean equals(Object zeit) {
        boolean istGleich = false;
        
        if (zeit instanceof Zeitspanne) {
            Zeitspanne vergleichsZeit = (Zeitspanne) zeit;
            
            int sekundenZeitspanne1 = vergleichsZeit.sekunden 
                    + (vergleichsZeit.minuten * 60) 
                    + (vergleichsZeit.stunden * 3600);
            
            int sekundenZeitspanne2 = this.sekunden + (this.minuten * 60)
                    + (this.stunden * 3600);
            
            istGleich = sekundenZeitspanne1 == sekundenZeitspanne2;
        }
        
        return istGleich;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.stunden;
        hash = 71 * hash + this.minuten;
        hash = 71 * hash + this.sekunden;
        return hash;
    }
}
