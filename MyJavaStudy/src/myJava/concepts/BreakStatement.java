package myJava.concepts;

//To display a color name depending on color value
public class BreakStatement {
	public static void main(String args[]) {
		boolean x = true;
		bl1: {
			bl2: {
				bl3: {
					System.out.println("Block3");
					if (x)
						break bl2;
				}
				System.out.println("Block2");
			}
			System.out.println("Block1");
		}
		System.out.println("Out of all blocks");
	}
}
/*
 * Output Block3 Block1 Out of all blocks
 */