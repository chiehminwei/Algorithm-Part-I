/* *****************************************
* CSCI205 - Software Engineering and Design
* Spring 2017
* Instructor: Your instructor
* Section: List time of your lecture
*
* Name: Jimmy Wei
* Date: 08/23/2017
*
* Lab / Assignment: Lab 01
*
* Description: Hello World in Java
*
* *****************************************/
package lab01;

public class Hello
{
	public static void main( String[] args ){
		long startTime = System.nanoTime();
		System.out.println("Programming is not a spectator sport!");
		long estimatedTime = System.nanoTime() - startTime;
		double estimatedTimeInMs = (double) estimatedTime / 1000000.0;
		System.out.println("Time to execute: " + estimatedTimeInMs + " Ms");
		System.exit(0);
	}
}