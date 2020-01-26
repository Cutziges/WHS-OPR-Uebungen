
package personal2;

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
        /*
        System.out.println("1: " + m1.darfBestellen(15));
        System.out.println("2: " + m1.darfBestellen(20));
        System.out.println("3: " + m1.darfBestellen(21));
        System.out.println("4: " + v2.darfBestellen(15));
        System.out.println("5: " + v2.darfBestellen(25));
        
        Mitarbeiter.setzeAllgemeinesLimit(30);
        */
        Mitarbeiter m2 = new Mitarbeiter("Willi Winzig");
        /*
        System.out.println("6: " + m1.darfBestellen(21));
        System.out.println("7: " + v2.darfBestellen(25));
        
        v1.setzeBestelllimit(10);
        System.out.println("8: " + v1.darfBestellen(10));
        System.out.println("9: " + v1.darfBestellen(11));
        
        v1.setzeBestelllimit(5000);
        System.out.println("10: " + v1.darfBestellen(2000));
        System.out.println("11: " + v1.darfBestellen(7000));
        System.out.println(v1.gibInfo());
        System.out.println(v2.gibInfo());
        System.out.println(m1.gibInfo());
        System.out.println(m2.gibInfo());
        */
        System.out.println(v1.gibHierarchie());
        System.out.println();
        System.out.println(v2.gibInfo());
        System.out.println(v2.gibHierarchie());
        System.out.println();
        System.out.println(m1.gibInfo());
        System.out.println( m1.gibHierarchie());
        System.out.println();
        v1.setzeVorgesetzten(null);
        System.out.println(m1.gibHierarchie());
        System.out.println();
        System.out.println(m2.gibInfo());
        System.out.println(m2.gibHierarchie());
        
        
    }
    
}
