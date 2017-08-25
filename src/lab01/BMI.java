/******************************************************************************
 *  Name: Jimmy Wei
 * 
 ******************************************************************************/

public class BMI { 
	private double mass;
	private double height;	

	public BMI(double mass, double height) {
		this.mass = mass;
		this.height = height;
	}

	public void calculateBMI() {
		double result = mass / height / height;
		System.out.println("The mass is: " + mass + " kg");
		System.out.println("The height is: " + height + " m");
		System.out.println("The BMI is: " + result);
	}

	public static void main(String[] args) {
		BMI bmi = new BMI(70, 1.8);
		bmi.calculateBMI();
	}
}