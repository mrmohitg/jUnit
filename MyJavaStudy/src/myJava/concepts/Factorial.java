package myJava.concepts;

//Calculate Factorial
public class Factorial {
	static public void Facto() {
		int factorial = 1, a, num = 5;
		for (a = 1; a <= num; ++a) {
			factorial = factorial * a;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}

	public static void main(String args[]) {
		Factorial.Facto();
	}
}
/*
 * Output Factorial of 5 is 120
 */