public class Cos {

    private double x;

    public Cos(double a) {
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
        for (int i = 1; sum != sum + term; i++) {
            term *= (d / i);
            if (i % 4 == 0) sum += term;
            if (i % 4 == 2) sum -= term;
        }
        return sum + 1;
    }

    public static double cosc(double d){
        Cos c1 = new Cos(d);
        return c1.computeTaylorSeries(c1.convertAngle(d));        
    }

    public static void main(String[] args) { 
        double x = -5.0;
        System.out.println(cosc(x));
        System.out.println(Math.cos(x));
    }
}
