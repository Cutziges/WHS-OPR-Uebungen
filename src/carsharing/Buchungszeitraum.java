
package carsharing;

import java.util.ArrayList;

/**
 *
 * @author Sarah Grugiel
 */
public class Buchungszeitraum {
    private final ArrayList<Buchung> buchungen;
    
    public Buchungszeitraum () {
        buchungen = new ArrayList<>();
    }
    
    public void bucheFahrzeug(Buchung anfrage) {
        buchungen.add(anfrage);
    }
}
