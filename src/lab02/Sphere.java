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
 * A simple program to calculate volume of a sphere.
 * *****************************************
 */
package lab02;

import java.util.Scanner;
// import java.lang.Math;

public class Sphere {
	private double radius;

	public Sphere() {
		// Prompt user for the radius of the sphere
		System.out.print("Enter the radius of the sphere: ");
        // Create the Scanner object, attached to console input
		Scanner in = new Scanner(System.in);
       	// Read and store the radius
		radius = in.nextDouble();
	}

	public void computeVolume() {
		// Compute the volume of the sphere
		double volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
		int roundedVolume = (int) Math.round(volume);
        // Display the result
		System.out.printf(
			"The volume is: %.2f%n" + 
			"Roundned to nearest integer: %d%n", 
			volume, roundedVolume);
	}

	public static void main(String[] args) {
		Sphere sphere = new Sphere();
		sphere.computeVolume();        
	}
}
