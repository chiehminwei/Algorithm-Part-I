/******************************************************************************
 *  Name: Jimmy Wei
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill t v
 *
 *  Given the temperature t (in Fahrenheit) and the wind speed v
 *  (in miles per hour), compute the wind chill w using the formula
 *  from the National Weather Service.
 *
 *     w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 *
 *  Reference:  http://www.nws.noaa.gov/om/windchill/index.shtml
 *
 ******************************************************************************/

public class WindChill {
    private double v;
    private double t;

    public WindChill(double v, double t) {
    	this.v = v;
    	this.t = t;
    }

    public double getVelocity() {
    	return v;
    }

    public void setVelocity(double v) {
    	this.v = v;
    }

    public double getTemperature() {
    	return t;
    }

    public void setTemperature(double t) {
    	this.t = t;
    }

    public void computeWindChill() {
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + this.t);
        System.out.println("Wind speed  = " + this.v);
        System.out.println("Wind chill  = " + w);
    }

    public static void main(String[] args) {
        // double t = Double.parseDouble(args[0]);
        // double v = Double.parseDouble(args[1]);
        WindChill wc = new WindChill(10, 20);
        wc.computeWindChill();
    }
}
