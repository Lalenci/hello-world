import java.util.Scanner;

public class BMI_Calc {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userChoice;
		double weight, height;
		
		System.out.println("Imperial or Metric? (1 for Imperial, 2 for Metric)");
		
		userChoice = scnr.nextInt();
		
		if(userChoice < 1 || userChoice > 2) {
			System.out.println("Incorrect selection.");
		}
		
		if(userChoice == 1) {
			System.out.print("\nInput your weight in pounds: ");
			weight = scnr.nextDouble();
			System.out.print("\nInput your height in inches: ");
			height = scnr.nextDouble();
			
			System.out.print("\nYour BMI: " + ((703*weight)/(height*height)));
			
			System.out.println("BMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater");
		}
		if(userChoice == 2) {
			System.out.print("\nInput your weight in kilograms: ");
			weight = scnr.nextDouble();
			System.out.print("\nInput your height in meters: ");
			height = scnr.nextDouble();
			
			System.out.print("\nYour BMI: " + ((weight)/(height*height)));
			
			System.out.println("BMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater");
		}
	}

}
