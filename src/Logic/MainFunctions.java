package Logic;
public class MainFunctions {
     private   TrigonometricFunctions   tr = new TrigonometricFunctions();
     private   LogarithmicFunctions     lg = new LogarithmicFunctions();
     private   CosFunction cos = new CosFunction();
     public Double  solveSystem( Double x){
        if (x>0)
        return solvePositive(x);
        else return solveNegative(x);
        }
     public Double solveNegative(Double x) {
        double result;
        result = (((((tr.tan(x) + tr.cot(x)) * tr.tan(x)) + (tr.tan(x) + cos.cos(x))) - ((tr.csc(x)
                + tr.cot(x)) * ((tr.cot(x) + tr.csc(x)) + tr.csc(x)))) - ((((tr.csc(x) + tr.tan(x))
                / tr.sec(x)) / (tr.tan(x) - (cos.cos(x) - tr.sin(x)))) * tr.sin(x)));
    return result;
    }

    public Double solvePositive(double x) {
        double result;
        if (x==1) return 0.;
        result = (Math.pow(((Math.pow(lg.ln(x),3) - lg.ln(x)) * lg.log10(x)) * (lg.log10(x) / lg.log3(x)),2));
        return result;
    }



}

