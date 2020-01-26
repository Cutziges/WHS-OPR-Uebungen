
package geometrie;

/**
 *
 * @author Sarah Grugiel
 * 8 Schnittstellen Aufgabe 2
 */
public class Rechteck implements Geo {
    private double laenge;
    private double breite;
    
    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public void skaliere(int faktor) {
        laenge = laenge * faktor;
        breite = breite * faktor;
    }

    @Override
    public double gibUmfang() {
        double umfang = 2 * (laenge + breite);
        
        return umfang;
    }
}
