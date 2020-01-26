
package geometrie;

/**
 *
 * @author Sarah Grugiel
 * 8 Schnittstellen Aufgabe 2
 */
public class Kreis implements Geo {
    private double radius;
    
    public Kreis(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double gibUmfang() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void skaliere(int faktor) {
        radius = faktor * radius;
    }
}
