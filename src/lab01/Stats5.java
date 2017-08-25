/******************************************************************************
 *  Name: Jimmy Wei
 * 

 *  Compilation:  javac Stats5.java
 *  Execution:    java Stats5
 *  
 *  Generate and print 5 random values between 0.0 and 1.0, and print
 *  their average value, min value, and max value.
 *
 *  % java Stats5
 *
 *  0.7203537279117841
 *  0.09574435157738448
 *  0.8979741693231866
 *  0.11949032184355113
 *  0.23425519545397544
 *  Average = 0.4135635532219763
 *  Min     = 0.09574435157738448
 *  Max     = 0.8979741693231866
 *
 *  % java Stats5
 *  0.25523821773554134
 *  0.6577131932424987
 *  0.14170223533941984
 *  0.2653444869526621
 *  0.895374957216799
 *  Average = 0.44307461809738424
 *  Min     = 0.14170223533941984
 *  Max     = 0.895374957216799
 *
 ******************************************************************************/

public class Stats5 { 
    private int n;
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double x5;

    private double min;
    private double max;
    private double average;

    public Stats5() {
        n = 5;
        x1 = Math.random();
        x2 = Math.random();
        x3 = Math.random();
        x4 = Math.random();
        x5 = Math.random();
    }

    public void printNumbers() {
        // print 5 values
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
    }

    public void computeStats() {
        // compute stats
        min     = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
        max     = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
        average = (x1 + x2 + x3 + x4 + x5) / n;
    }

    public void printStats() {
        // print stats
        System.out.println("Average = " + average);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }

    public static void main(String[] args) { 
        Stats5 stats = new Stats5();
        stats.printNumbers();
        stats.computeStats();
        stats.printStats();
    }
}
