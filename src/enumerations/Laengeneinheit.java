
package enumerations;

/**
 *
 * @author Sarah
 */
public enum Laengeneinheit {
    MM(1),
    CM(10),
    M(1000),
    KM(1000000);
    private final double mm;
    
    Laengeneinheit(double mm) {
        this.mm = mm;
    }
    
    public double mm() {
        return mm;
    }
    
    public double mm(Laengeneinheit einheit) {
        double wert = 0;
        Laengeneinheit vergleichsWert = this;
        
        if (vergleichsWert == MM) {
            wert = einheit.mm();
        } else if (vergleichsWert == CM) {
            if (einheit != null) switch (einheit) {
                case MM:
                    wert = 10;
                    break;
                case CM:
                    wert = 1;
                    break;
                case M:
                    wert = 0.01;
                    break;
                case KM:
                    wert = 0.00001;
                    break;
                default:
                    break;
            } else if (vergleichsWert == M) {
                if (einheit != null) switch (einheit) {
                    case MM:
                        wert = 1000;
                        break;
                    case CM:
                        wert = 100;
                        break;
                    case M:
                        wert = 1;
                        break;
                    case KM:
                        wert = 0.001;
                        break;
                }
            } else if (vergleichsWert == KM) {
                if (einheit != null) switch (einheit) {
                    case MM:
                        wert = 1000000;
                        break;
                    case CM:
                        wert = 100000;
                        break;
                    case M:
                        wert = 1000;
                        break;
                    case KM:
                        wert = 1;
                        break;
                }
            }
        }
        return wert;
    }
    
    public static void main(String[] args) {
        System.out.println(Laengeneinheit.KM.mm());
        System.out.println(Laengeneinheit.M.mm(CM));
        System.out.println(Laengeneinheit.CM.mm(M));
        System.out.println(Laengeneinheit.CM.mm(KM));
    }
}
