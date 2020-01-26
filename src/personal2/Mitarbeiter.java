
package personal2;

import java.util.ArrayList;

/**
 *
 * @author Sarah
 */
public class Mitarbeiter {
    
    private final String name;
    private Vorgesetzter chef;
    private static int bestellLimit = 20;
    
    public Mitarbeiter (String name) {
        this.name = name;
    }
    
    public static void setzeAllgemeinesLimit (int limit) {
        // warum ist hier kein this möglich?
        bestellLimit = limit;
    }
    
    protected int gibAllgemeinesLimit() {
        return bestellLimit;
    }
    
    public void setzeVorgesetzten (Vorgesetzter chef) {
        this.chef = chef;
    }
    
    public Vorgesetzter gibVorgesetzten() {
        return this.chef;
    }
    
    public boolean darfBestellen (int kosten) {
        boolean darfBestellen = false;
        
        if (kosten <= this.gibAllgemeinesLimit()) {
            darfBestellen = true;
        }
        
        return darfBestellen;
    }
    
    public String gibPosition () {
        String bezeichnung = "";
        
        if (this.gibVorgesetzten() != null) {
            bezeichnung = "Mitarbeiter";
        } else {
            bezeichnung = "freier Mitarbeiter";
        }
        
        return bezeichnung;
    }
    
    public String gibInfo() {
        Mitarbeiter vorgesetzter = this.gibVorgesetzten();
        String infoText = "";
        String vText = "";
        
        if (vorgesetzter != null) {
            vText = ". Mein Vorgesetzter ist " + vorgesetzter.name;
        }
        
        infoText = "Ich bin " + this.gibPosition() + ", Name " 
                    + this.name + vText + ". Mein Bestelllimit beträgt " 
                    + this.gibAllgemeinesLimit() + "EUR.";
        
        return infoText;
    }
    
    public String gibHierarchie() {
        String hierarchie = "";
        
        if (this.gibVorgesetzten() != null) {
            this.gibVorgesetzten().gibHierarchie();
            System.out.println(this.gibPosition() + " " + this.name);
        } else {
            System.out.println(this.gibPosition() + " " + this.name);
        }
        
        return hierarchie;
    }
    
    public void gibPersonalstruktur(ArrayList<Mitarbeiter> liste) {
        
    }
}