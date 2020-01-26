
package personal2;

/**
 *
 * @author Sarah
 */
public class Vorgesetzter extends Mitarbeiter {
    private int bestellLimit = -1;
    
    public Vorgesetzter(String name) {
        super(name);
    }
    
    public void setzeBestelllimit (int limit) {
        this.bestellLimit = limit;
    }
    
    @Override
    protected int gibAllgemeinesLimit() {
        int limit = this.bestellLimit;
        
        if (limit < 0) {
            limit = super.gibAllgemeinesLimit();
        }
        
        return limit;
    }
    
    @Override
    public String gibPosition() {
        String bezeichnung = "Vorgesetzter";
        
        return bezeichnung;
    }
}
