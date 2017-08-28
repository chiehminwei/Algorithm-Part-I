/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2017
 *
 * Name: Jimmy Wei
 * Date: 08/27/2017
 *
 * Lab: Lab02, Exercise 5
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
// import java.lang.Math;

public class Sphere {
	public static void main(String[] args) {

        // Prompt user for the radius of the sphere
		System.out.print("Enter the radius of the sphere: ");
        // Create the Scanner object, attached to console input
		Scanner in = new Scanner(System.in);
       	// Read and store the radius
		double radius = in.nextDouble();
        // Compute the volume of the sphere
		double volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
		int roundedVolume = (int) Math.round(volume);
        // Display the result
		System.out.printf(
			"The volume is: %.2f%n" + 
			"Roundned to nearest integer: %d%n", 
			volume, roundedVolume);
	}
}
