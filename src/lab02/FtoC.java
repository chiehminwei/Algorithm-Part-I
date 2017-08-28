/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2017
 *
 * Name: Jimmy Wei
 * Date: 08/27/2017
 *
 * Lab: Lab02, Exercise 2
 *
 * @author Brian King, 2017-Spring
 *
 * Description:
 * A simple program to ask the user for a temperature in F, and converts it to
 * Celsius.
 * *****************************************
 */
// package lab02;

import java.util.Scanner;


public class FtoC {
	public static void main(String[] args) {

		while (true) {
        	// Prompt user for a Fahrenheit temp
			System.out.print("Enter a temperature in Fahrenheit: ");
        	// Create the Scanner object, attached to console input
			Scanner in = new Scanner(System.in);
       		 // Read and store the Fahrenheit temp
			int fahTemp = in.nextInt();
        	// Convert the temp to Celsius
			double celTemp = 5.0 / 9.0 * (fahTemp - 32);
        	// Output the results with correct formatting
			System.out.println(String.format("%d F = %.1f C", fahTemp, celTemp));

    		// Branching
			if (celTemp <= 0) {
				System.out.println("Brrr... it is FREEZING out!");
			}
			else if (celTemp <= 15) {
				System.out.println("It's a bit cool out");
			}
			else if (celTemp <= 30) {
				System.out.println("It's comfortably warm");
			}
			else {
				System.out.println("It's HOT! I need A/C!");
			}
			System.out.print("Try again? [y | n]: ");
			if (!in.next().equalsIgnoreCase("y"))
				break;
		}
		System.out.println("Goodbye!");
	}
}
