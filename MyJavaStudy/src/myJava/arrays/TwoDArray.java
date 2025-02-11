package myJava.arrays;

//Displaying a 2D array as a matrix.
public class TwoDArray {
	public static void main(String args[]) {
		float x[][] = { { 1.1f, 1.2f, 1.3f, 1.4f }, { 2.1f, 2.2f, 2.3f, 2.4f }, { 3.1f, 3.2f, 3.3f, 3.4f } };
		System.out.println("In matrix form");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
/*
 * Output In matrix form 1.1 1.2 1.3 1.4
 * 
 * 2.1 2.2 2.3 2.4
 * 
 * 3.1 3.2 3.3 3.4
 */