package myJava.concepts;

//To display numbers from 1 to 10
public class DoWhileLoop {
	public static void main(String args[]) {
		int x;
		x = 1;
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);
	}
}
/*
 * Output 1 2 3 4 5 6 7 8 9 10
 */