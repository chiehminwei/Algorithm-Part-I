/******************************************************************************
 *  Compilation:  javac RollLoadedDie.java
 *  Execution:    java RollLoadedDie
 *
 *  Simulate the roll of a loaded six-sided die, where the values
 *  1, 2, 3, 4, and 5 appear with probability 1/8 and the value 6
 *  appears with probablity 3/8, and print the resulting number.
 *
 *  % java RollLoadedDie
 *  4
 *
 *  % java RollLoadedDie
 *  6
 *
 ******************************************************************************/

public class RollLoadedDie {

    private double[] probabilityArray = {1.0/8, 1.0/8, 1.0/8, 1.0/8, 1.0/8, 3.0/8};

    public RollLoadedDie() {
        double[] initArray = {0, 0, 0, 0, 0, 0};
        int n = probabilityArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                initArray[i] += probabilityArray[j];
            }
        }
        probabilityArray = initArray;
    }

    public int rollDie() {
        // double in the range [0.0, 1.0)
        double r = Math.random();

        // integer in the range 1 to 6 with desired probabilities
        int roll;
        if      (r < probabilityArray[0]) roll = 1;
        else if (r < probabilityArray[1]) roll = 2;
        else if (r < probabilityArray[2]) roll = 3;
        else if (r < probabilityArray[3]) roll = 4;
        else if (r < probabilityArray[4]) roll = 5;
        else                  roll = 6;

        return roll;
    }

    public static int rollDieMain() {
        RollLoadedDie die = new RollLoadedDie();
        return die.rollDie();
    }

    public static void main(String[] args) {
        int roll = rollDieMain();        
        // print result
        System.out.println(roll);
    }
}


