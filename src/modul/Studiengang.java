
package modul;

/**
 *
 * @author Sarah Grugiel
 * 9 Modulverwaltung
 * Aufzählungstyp, dessen Werte alle Studiengänge
 * des Fachbereichs repräsentieren.
 */
public enum Studiengang {
    IN_BA(true),
    MI_BA(true),
    WI_BA(true),
    IN_MA(false),
    MI_MA(false),
    WI_MA(false),
    IS_MA(false);
    
    private Studiengang(boolean bachelor) {
        this.istBachelorstudiengang = bachelor;
    }
    
    private final boolean istBachelorstudiengang;
    
    public boolean istBachelorstudiengang() {
        return istBachelorstudiengang;
    }
}