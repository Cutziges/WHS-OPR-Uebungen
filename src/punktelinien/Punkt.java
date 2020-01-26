
package punktelinien;

/**
 *
 * @author Sarah
 */
public class Punkt {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object o) {
        boolean gleich = false;
        
        if (o instanceof Punkt) {
            Punkt p = (Punkt) o;
            
            // int hat keine .hashCode Methode, direkter Vergleich möglich
            gleich = this.x == p.x && this.y == p.y;
        }
        
        return gleich;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.x;
        hash = 79 * hash + this.y;
        return hash;
    }
}
