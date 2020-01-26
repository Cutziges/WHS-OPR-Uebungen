
package uebung2;

/**
 *
 * @author sarantel
 */
public class P {
    public String m1(P par) {
        return "[Pm1" + par.m2(this) + "]";
    }
    
    public String m2(P par) {
        return "(Pm2" + this.m3() + par.m3() + ")";
    }
    
    public String m3() {
        return "Pm3";
    }
}
