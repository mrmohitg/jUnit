package myJava.concepts;

//Using Continue Statements
public class ContinueStatement {
	public static void main(String args[]) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 3 || i == 7)
				continue;
			System.out.println("The number is " + i);
		}
	}
}
/*
 * Output The number is 1 The number is 2 The number is 4 The number is 5 The
 * number is 6 The number is 8 The number is 9 The number is 10
 */