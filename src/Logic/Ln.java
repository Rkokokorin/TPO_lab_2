package Logic;

public class Ln{

     public double ln(double x) {
        if (x==1)
           return 0;
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
}