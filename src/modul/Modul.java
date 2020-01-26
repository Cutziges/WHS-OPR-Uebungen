
package modul;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sarah Grugiel
 * 9 Modulverwaltung
 * Repräsentation eines Moduls
 */
public class Modul {
    private String kuerzel;
    private String bezeichnung;
    public boolean istBachelorstudiengang;
    private ArrayList<Studiengang> studiengaenge;

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    
    public Modul(String kuerzel, String bezeichnung) {
        this.kuerzel = kuerzel;
        this.bezeichnung = bezeichnung;
    }
    
    public void fuegeHinzu(Studiengang s) throws IllegalArgumentException {
        try {
            if (studiengaenge.isEmpty()) {
               this.istBachelorstudiengang = s.istBachelorstudiengang();
            }
            if (this.istBachelorstudiengang == s.istBachelorstudiengang()) {
                studiengaenge.add(s);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ein Modul kann nicht gleichzeitig zu"
                    + "Bachelor- und Masterstudiengang gehören.");
        }
    }
}
