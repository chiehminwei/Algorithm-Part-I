/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2017
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
package lab02;

import java.util.Scanner;


public class CtoF {
	private double fahTemp;
	private int celTemp;
	private Scanner in;
	private boolean repeat;

	public CtoF() {
		repeat = true;
	}

	public void prompt() {
		// Prompt user for a Fahrenheit temp
		System.out.print("Enter a temperature in Celsius: ");
       	// Create the Scanner object, attached to console input
		in = new Scanner(System.in);
     	// Read and store the Celsius temp
		celTemp = in.nextInt();
        // Convert the temp to Fahrenheit
		fahTemp = 9.0 / 5.0 * fahTemp + 32;
        // Output the results with correct formatting
		System.out.println(String.format("%d C = %.1f F", celTemp, fahTemp));
	}

	public void branch() {
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
	}

	public void again() {
		System.out.print("Try again? [y | n]: ");
		if (!in.next().equalsIgnoreCase("y")) {
			repeat = false;
			in.close();
		}
	}

	public static void main(String[] args) {
		CtoF cf = new CtoF();
		while (cf.repeat) {
			cf.prompt();
			cf.branch();
   			cf.again();						
		}
		System.out.println("Goodbye!");
	}
}
