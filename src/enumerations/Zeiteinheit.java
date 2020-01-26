
package enumerations;

/**
 *
 * @author Sarah
 */
public enum Zeiteinheit {
    SEKUNDE(1),
    MINUTE(60),
    STUNDE(60*60),
    TAG(60*60*24);
    
    /**
     * Sekunden Variable.
     */
    private final int sekunden;
    
    /**
     * Erzeugt Zeiteinheit.
     * @param sekunden übergebene Sekunden
     */
    Zeiteinheit(int sekunden) {
        this.sekunden = sekunden;
    }
    
    /**
     * Gibt die Sekunden wieder.
     * @return sekundenwert
     */
    public int sekunden() {
        return sekunden;
    }
}
