
package personal;

/**
 *
 * @author Sarah Grugiel
 */
public class MitarbeiterTest {
    /**
     * Testen der Klassen.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("Walter Winkelmann");
        Vorgesetzter v1 = new Vorgesetzter("Waltraud Wichtig");
        Vorgesetzter v2 = new Vorgesetzter("Hermann Wichtiger");
        
        m1.setzeVorgesetzten(v1);
        v1.setzeVorgesetzten(v2);
        
        System.out.println(m1.darfBestellen(15));
        System.out.println(m1.darfBestellen(20));
        System.out.println(m1.darfBestellen(21));
        System.out.println(v2.darfBestellen(15));
        System.out.println(v2.darfBestellen(25));
        
        Mitarbeiter.setzeAllgemeinesLimit(30);
        Mitarbeiter m2 = new Mitarbeiter("Willi Winzig");
        
        System.out.println(m1.darfBestellen(21));
        System.out.println(v2.darfBestellen(25));
        
        v1.setzeBestelllimit(10);
        System.out.println(v1.darfBestellen(10));
        System.out.println(v1.darfBestellen(11));
        
        v1.setzeBestelllimit(5000);
        System.out.println(v1.darfBestellen(2000));
        System.out.println(v1.darfBestellen(7000));
        System.out.println(v1.gibInfo());
        v1.gibHierarchie();
        
        System.out.println(v2.gibInfo());
        v2.gibHierarchie();
        
        System.out.println(m1.gibInfo());
        m1.gibHierarchie();
        
        v1.setzeVorgesetzten(null);
        m1.gibHierarchie();
        
        System.out.println(m2.gibInfo());
        m2.gibHierarchie();
        
        
    }
    
}
