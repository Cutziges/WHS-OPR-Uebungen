
package personal;

/**
 *
 * @author Sarah Grugiel
 */
public class Vorgesetzter extends Mitarbeiter {
    /**
     * Variable für Bestelllimit.
     */
    private int bestellLimit = -1;
    
    /**
     * Erstellt neues Objekt vom Typ Vorgesetzter.
     * @param name Name des Vorgesetzten
     */
    public Vorgesetzter(String name) {
        super(name);
    }
    
    /**
     * Setzt ein neues Bestelllimit.
     * @param limit Neues Bestelllimit
     */
    public void setzeBestelllimit(int limit) {
        this.bestellLimit = limit;
    }
    
    @Override
    protected int gibAllgemeinesLimit() {
        int limit = this.bestellLimit;
        
        if (this.bestellLimit < 0) {
            limit = super.gibAllgemeinesLimit();
        } 
        return limit;
    }
    
    @Override
    protected String gibPersonalbezeichnung() {
        return "Vorgesetzter";
    }
}
