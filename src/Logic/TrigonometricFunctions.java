package Logic;
import static java.lang.Math.abs;
public class TrigonometricFunctions {
    CosFunction cosFunction = new CosFunction();
    private static final int n = 8;

    public  double sin(double x) {
        x = normalizeX(x);
        int sign = ((x > -Math.PI / 2) && (x < Math.PI / 2)) ? 1 : -1;
        return sign * Math.pow(1 - Math.pow(cosFunction.cos(x), 2), 0.5);
    }
    public double tan(double x) {
        return sin(x) / cosFunction.cos(x);
    }
    public double cot(double x) {
        return cosFunction.cos(x) / sin(x);
    }

    public double csc(double x) {
        return 1 / sin(x);
    }
    public double sec(double x) {
        return 1 / cosFunction.cos(x);
    }

    private double normalizeX(double x) {
        return x % (2 * Math.PI);
    }

}

