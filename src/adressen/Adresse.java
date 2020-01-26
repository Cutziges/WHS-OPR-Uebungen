
package adressen;

import java.util.Objects;

/**
 *
 * @author Sarah
 */
public class Adresse {
    private String plz;
    private String strasse;
    
    public Adresse(String plz, String strasse) {
        this.plz = plz;
        this.strasse = strasse;
    }
    
    @Override
    public boolean equals(Object o) {
        boolean gleich = false;
        
        if (o instanceof Adresse) {
            Adresse a = (Adresse) o;
            
            gleich = this.plz.equals(a.plz) && this.strasse.equals(a.strasse);
        }
        
        return gleich;
    }

    @Override
    public int hashCode() {
        return plz.hashCode() + strasse.hashCode();
    }
    
}
