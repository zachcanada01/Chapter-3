package Excercise;
import java.util.Scanner;
public class Testlbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pounds;
		double kilograms = .453;
		double ounces = 16;
		double miligrams = 453592;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your weight in lbs >> ");
		pounds = input.nextInt();
		
		poundsToKilograms( pounds, kilograms);
		poundsToOunces(pounds, ounces);
		poundsToMiligrams(pounds, miligrams);
		
	}

	

	public static void poundsToKilograms(double pounds, double kilograms) {
		// TODO Auto-generated method stub
		
		System.out.println("Your weight in kilograms is " + pounds * kilograms);
		
	}

	public static void poundsToOunces(double pounds, double ounces) {
		// TODO Auto-generated method stub
		System.out.println("Your weight in ounces is " + pounds * ounces);
		
	}
	public static void poundsToMiligrams(double pounds, double miligrams) {
		// TODO Auto-generated method stub
		System.out.println("Your weight in miligrams is " + pounds * miligrams);

	}
	
	
	

}
