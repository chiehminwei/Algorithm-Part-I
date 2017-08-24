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
		long t_start = System.nanoTime();
		System.out.println("Programming is not a spectator sport!");
		long t_end = System.nanoTime();
		long time_elapsed = t_end - t_start;
		System.out.println("Time to execute: " + time_elapsed + " ns");
		System.exit(0);
	}
}