package myJava.exceptionHandling;

//This program shows how to use throws keyword. It is used for skipping handling of the exception and intimating the end user to use the handling block.
import java.util.*;

public class Throws {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int x = sc.nextInt();
			System.out.println("Enter the second number");
			int y = sc.nextInt();
			Devide.devide(x, y);
			sc.close();

		} catch (ArithmeticException e) {
			System.out.println(e);
			;
		}
		System.out.println("Main Ends");
	}

}

class Devide {
	public static void devide(int x, int y) throws ArithmeticException {
		int z = x / y;
		System.out.println("The division of number is " + z);
	}
}

/*
 * Output Enter the first number 30 Enter the second number 0
 * java.lang.ArithmeticException: / by zero Main Ends
 */