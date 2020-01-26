
package personal;

/**
 *
 * @author Sarah Grugiel
 */
public class Mitarbeiter {
    /**
     * Name des Mitarbeiters.
     */
    private final String name;
    
    /**
     * Allgemeines (globales) Bestelllimit.
     */
    private static int bestellLimit = 20;
    
    /**
     * Vorgesetzter des Mitarbeiters, falls vorhanden.
     */
    private Vorgesetzter chef;
    
    /**
     * Erstell Objekt vom Typ Mitarbeiter.
     * @param name Name des Mitarbeiters
     */
    public Mitarbeiter(String name) {
        this.name = name;
    }
    
    /**
     * Überschreibt das Bestelllimit.
     * @param limit Neues Limit
     */
    public static void setzeAllgemeinesLimit(int limit) {
        bestellLimit = limit;
    }
    
    /**
     * Gibt das Bestelllimit aus.
     * @return Bestelllimit
     */
    protected int gibAllgemeinesLimit() {
        return bestellLimit;
    }
    
    /**
     * Setzt den Vorgesetzten.
     * @param chef neuer Vorgesetzter
     */
    public void setzeVorgesetzten(Vorgesetzter chef) {
        this.chef = chef;
    }
    
    /**
     * Gibt den Vorgesetzten aus.
     * @return Vorgesetzter
     */
    public Vorgesetzter gibVorgesetzten() {
        return chef;
    }
    
    /**
     * Gibt an, ob Bestellwert im Rahmen des Mitarbeiters liegt.
     * @param kosten Bestellwert
     * @return Wahrheitswert
     */
    public boolean darfBestellen(int kosten) {
        boolean bestellbar = false;
        
        if (kosten <= this.gibAllgemeinesLimit()) {
            bestellbar = true;
        }
        
        return bestellbar;
    }
    
    /**
     * Gibt die Hierarchie aus, oberster Chef an erster Stelle.
     * @return Hierarchie
     */
    public String gibHierarchie() {
        String hierarchie = "";
        
        if (this.gibVorgesetzten() != null) {
            this.gibVorgesetzten().gibHierarchie();
            System.out.println(this.gibPersonalbezeichnung() + " " + this.name);
        } else {
            System.out.println(this.gibPersonalbezeichnung() + " " + this.name);
        }
            
        return hierarchie;
    }
    
    /**
     * Bestimmt ob Mitarbeiter oder Vorgesetzter.
     * @return Bezeichnung
     */
    protected String gibPersonalbezeichnung() {
        String bezeichnung = "";
        
        if (this.gibVorgesetzten() != null) {
            bezeichnung = "Mitarbeiter";
        } else {
            bezeichnung = "freier Mitarbeiter";
        }
        return bezeichnung;
    }
    
    /**
     * Gibt Info über den Mitarbeiter aus.
     * @return Informationstext
     */
    public String gibInfo() {
        Mitarbeiter vorgesetztePerson = this.gibVorgesetzten();
        String vorgesetzterText = "";
        
        if (vorgesetztePerson != null) {
            vorgesetzterText = "Mein Vorgesetzter ist "
                                 + vorgesetztePerson.name + ". ";
        }
        
        String infoText = ("Ich bin " + gibPersonalbezeichnung()
              + ", Name " + name + ". "
              + vorgesetzterText
              + "Mein Bestelllimit ist " + gibAllgemeinesLimit() + " EUR.");
        
        return infoText;
    }
}
