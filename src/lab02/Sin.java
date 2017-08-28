public class Sin {

    private double x;

    public Sin(double a) {
        x = a;
    }

    // convert x to an angle between -2 PI and 2 PI
    public double convertAngle (double d) {
        d = d % (2 * Math.PI);
        return d;
    } 

    // compute the Taylor series approximation
    public double computeTaylorSeries(double d) {
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series
        for (int i = 1; term != 0.0; i++) {
            term *= (d / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        return sum;
    }

    public static double sinc(double d){
        Sin s1 = new Sin(d);
        return s1.computeTaylorSeries(s1.convertAngle(d));        
    }

    public static void main(String[] args) { 
        double x = -5.0;
        System.out.println(sinc(x));
        System.out.println(Math.sin(x));
    }
}
