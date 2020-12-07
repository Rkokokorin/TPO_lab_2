package Logic;

public class LogarithmicFunctions {
    Ln ln = new Ln();
    public double ln(double x) {
        return ln.ln(x);
        }

    public double log3(Double x) {
        return ln.ln(x) / ln.ln(3.0);
    }

    public double log10(Double x) {
        return ln.ln(x) * 0.4342944819;
    }
}
