
package uebung3;

/**
 *
 * @author Sarah Grugiel
 */
public class Zeitspanne {
    private final int stunden;
    private final int minuten;
    private final int sekunden;

    /**
     * Erzeugt ein Objekt dieser Klasse.
     * Die Parameter dürfen nicht negativ sein.
     * @param stunden hh
     * @param minuten mm
     * @param sekunden ss
     */
    public Zeitspanne(int stunden, int minuten, int sekunden) {
        this.stunden = stunden;
        this.minuten = minuten;
        this.sekunden = sekunden;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean istGleich = false;
        
        if (obj instanceof Zeitspanne) {
            Zeitspanne vergleichsZeit = (Zeitspanne) obj;
            
            int sekundenObjekt = (((this.stunden * 3600) + (this.minuten * 60))
                + this.sekunden);
            
            int sekundenVergleichsobjekt = (((vergleichsZeit.stunden) * 3600)
                + ((vergleichsZeit.minuten) * 60)
                + vergleichsZeit.sekunden);
        
            istGleich = (sekundenObjekt == sekundenVergleichsobjekt);
        }
        
        return istGleich;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.stunden;
        hash = 17 * hash + this.minuten;
        hash = 17 * hash + this.sekunden;
        return hash;
    }
}
