package Logic;

public class LogarithmicFunctions {
    public  double ln(double x) {
        double x1 = (x - 1) / (x + 1);
        double current = x1;
        double result = 0;
        int n = 3;
        if (x<=0){
            throw new IllegalArgumentException();
        }
        while (Math.abs(2 * current) > 1E-8) {
            result += 2 * current;
            current *= Math.pow(x1, 2) / n * (n - 2);
            n += 2;
        }
        return result;
    }
    public double log3(Double x) {
        return ln(x) / ln(3.0);
    }

    public double log10(Double x) {
        return ln(x) * 0.4342944819;
    }
}
