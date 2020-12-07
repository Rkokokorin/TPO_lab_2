package Logic;

public class TrigonometricFunctions {
    CosFunction cosFunction = new CosFunction();
    private static final int n = 8;

    public  double sin(double x) {
        double x1 = normalizeX(x);
        int sign = ((x1 > 0) && (x1 < Math.PI )) ? 1 : -1;
        return sign * Math.pow(1 - Math.pow(cosFunction.cos(x), 2), 0.5);
    }
    public double cos(double x) {

        return cosFunction.cos(x) ;
    }
    public double tan(double x) {
        return sin(x) / cosFunction.cos(x);
    }
    public double cot(double x) {
        return cosFunction.cos(x) / sin(x); }
    public double csc(double x) {
        return 1 / sin(x);
    }
    public double sec(double x) {
        if (cosFunction.cos(x) == 0)
            return  Double.NaN;
        return 1 / cosFunction.cos(x);
    }
    private double normalizeX(double x) {
        return x % (2 * Math.PI);
    }

}

