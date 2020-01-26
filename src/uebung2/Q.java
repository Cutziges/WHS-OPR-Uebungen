
package uebung2;

/**
 *
 * @author sarantel
 */
public class Q extends P{
    public String m1(P par) {
        return "[Qm1" + super.m1(par) + "]";
    }
    
    public String m2(P par) {
        return "(Qm2" + super.m2(par) + ")";
    }
    
    public String m3() {
        return "Qm3";
    }
}
