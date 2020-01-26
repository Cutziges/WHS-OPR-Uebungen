
package geometrie;

/**
 *
 * @author Sarah Grugiel
 * sehr wütend gerade
 * Kuba pupst wieder viel
 * aus dem Mund und Po
 */
public class Hurensohn {
    public static void main(String[] args) {
        Geo g = new Kreis(2.0);
        // hier ist die Polymorphie laut Kuba
        g = new Rechteck(2.0, 1.0);
        // in Geo kann sich alles mögliche befinden usw blah
        
        // Figur in alle Richtungen um Faktor 3 vergrößern
        g.skaliere(3);
        
        // erwartete Ausgabe: Umfang = 18.0
        System.out.println("Umfang = " + g.gibUmfang());
    }
}
