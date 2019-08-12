package myJava.staticBlock;

//Using static block.
public class StaticBlockDemo {
	static {
		System.out.println("This is a static block.");
	}
	// public static void main(String args[])
	// {
	// System.out.println("This is main block.");
	// }
}
/*
 * Output Error: Main method not found in class StaticBlockDemo, please define
 * the main method as: public static void main(String[] args) or a JavaFX
 * application class must extend javafx.application.Application
 */