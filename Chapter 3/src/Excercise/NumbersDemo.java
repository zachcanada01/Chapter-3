package Excercise;
import java.util.Scanner;

public class NumbersDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 12;
		
		Scanner input = new Scanner(System.in);

		
		displayTwiceTheNumber(x,y);
		displayNumberPlus5(x,y);
		displayNumberSquared(x,y);
		
	}
	public static void displayTwiceTheNumber(int x, int y) {
			int x2;
			int y2;
			
			x2 = x * 5;
			y2 = y * 5;
			displayMessage(x2, y2);
			
}
	public static void displayNumberPlus5(int x, int y) {
			int x2;
			int y2;
			
			x2 = x + 5;
			y2 = y + 5;
			displayMessage(x2, y2);
			}
	public static void displayNumberSquared(int x, int y) {
			int x2;
			int y2;
			
			x2 = x * x;
			y2 = x * x;
			displayMessage(x2, y2);
		

	}
	public static void displayMessage(int x, int y) {
		
		
		System.out.println("x = " + x + " y = " + y);

	}
	
	
}