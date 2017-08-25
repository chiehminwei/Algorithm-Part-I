// package lecture02;

/******************************************************************************
 * Name: Jimmy Wei
 *  http://introcs.cs.princeton.edu/java/12types/IntOps.java.html
 *   ******************************************************************************/
import java.util.Scanner;
public class addMultiplyDivide {
	private int a;
	private int b;

	public addMultiplyDivide(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void add() {
		System.out.println(a + " + " + b + " = " + a + b);
	}

	public void multiply() {
		System.out.println(a + " * " + b + " = " + a * b);
	}

	public void divide() {
		System.out.println(a + " / " + b + " = " + a / b);
	}


	public static void main(String[] args) {
			//System.out.println("Enter integer a ");
			//Scanner sc = new Scanner(System.in);
			//int a = sc.nextInt(); 
			//System.out.println("Enter integer b ");
			//int b = sc.nextInt();
			//sc.close(); 
		addMultiplyDivide obj = new addMultiplyDivide(10, 20);
		obj.add();
		obj.multiply();
		obj.divide();   
	}
}


