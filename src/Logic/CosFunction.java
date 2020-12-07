package Logic;

public class CosFunction {
    private static final int n = 8;
    public double cos(double x) {
        x = normalizeX(x);
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result += (Math.pow(-1, i) * Math.pow(x, 2 * i)) /
                    factorial(2 * i);
        }
        return result;
    }

    public static long factorial(int a) {
        long result = 1;

        while (a > 0) {
            result = result * a;
            a--;
        }
        return result;
    }
    private double normalizeX(double x) {
        return x % (2 * Math.PI);
    }
}