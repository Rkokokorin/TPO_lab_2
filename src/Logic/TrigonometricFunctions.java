package Logic;
import static java.lang.Math.abs;
public class TrigonometricFunctions {
    private static final int n = 8;
    public double cos(double x) {
            x = normalizeX(x);
            double result=0;
            for (int i = 0; i <= n; i++) {
                result += (Math.pow(-1, i) * Math.pow(x, 2*i)) /
                        factorial(2*i);
                }
            return result;
        }
    public double sin(double x) {
        x = normalizeX(x);
        int sign = ((x > -Math.PI / 2) && (x < Math.PI / 2)) ? 1 : -1;
        return sign * Math.pow(1 - Math.pow(cos(x), 2), 0.5);
    }
    public double tan(double x) {
        return sin(x) / cos(x);
    }
    public double cot(double x) {
        return cos(x) / sin(x);
    }

    public double csc(double x) {
        return 1 / sin(x);
    }
    public double sec(double x) {
        return 1 / cos(x);
    }

    private double normalizeX(double x) {
        return x % (2 * Math.PI);
    }
    public static long factorial( int a){
        long result=1;

        while( a>0 ){
            result= result*a;
            a--;
        }
        return result;
    }
}

