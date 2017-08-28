/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2017
 *
 * Name: YOUR NAME
 * Date: ??/??/????
 *
 * Lab: Lab02, Exercise 4
 *
 * Description:
 * This is a simple program to compute a proper amount of change given some
 * number of pennies.
 *
 * @author BRK 2012-fall, with slight modifications in 2015
 */

package lab02;

import java.util.Scanner;

public class Change {

    final static int PENNIES_PER_NICKEL = 5;
    final static int PENNIES_PER_DIME = 10;
    final static int PENNIES_PER_QUARTER = 25;
    final static int PENNIES_PER_DOLLAR = 100;
    final static double PENNY_IN_DOLLAR = 0.01;

    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter the number of pennies: ");

            int initPennies = in.nextInt();
            int pennies = initPennies;

            // Compute number of coins & leftover pennies for each face value
            int dollars = pennies / PENNIES_PER_DOLLAR;
            double dollarValue = dollars * PENNY_IN_DOLLAR * PENNIES_PER_DOLLAR;
            pennies %= PENNIES_PER_DOLLAR;

            int quarters = pennies / PENNIES_PER_QUARTER;
            double quarterValue = quarters * PENNY_IN_DOLLAR * PENNIES_PER_QUARTER;
            pennies %= PENNIES_PER_QUARTER;

            int dimes = pennies / PENNIES_PER_DIME;
            double dimeValue = dimes * PENNY_IN_DOLLAR * PENNIES_PER_DIME;
            pennies %= PENNIES_PER_DIME;

            int nickels= pennies / PENNIES_PER_NICKEL;
            double nickelValue = nickels * PENNY_IN_DOLLAR * PENNIES_PER_NICKEL;
            pennies %= PENNIES_PER_NICKEL;

            double pennyValue = pennies * PENNY_IN_DOLLAR;

            // Output the results
            System.out.printf(
                "%4d pennies breaks down to:%n" +
                "%4d %-8s = $%5.2f%n" +
                "%4d %-8s = $%5.2f%n" +
                "%4d %-8s = $%5.2f%n" +
                "%4d %-8s = $%5.2f%n" +
                "%4d %-8s = $%5.2f%n",
                initPennies, 
                dollars, "dollars", dollarValue,
                quarters, "quarters", quarterValue,
                dimes, "dimes", dimeValue,
                nickels, "nickels", nickelValue,
                pennies, "pennies", pennyValue);
            // Repeat
            System.out.print("Try again? [y | n]: ");
            if (in.next().equalsIgnoreCase("n"))
                break;
        }
        System.out.println("Goodbye!");
    }
}
