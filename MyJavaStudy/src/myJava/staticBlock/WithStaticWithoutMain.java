package myJava.staticBlock;

//This will not work only static block with out main function.
public class WithStaticWithoutMain {
	static {
		System.out.println(" With Static Block but Without Main function.");
	}
}
/*
 * Output Error: Main method not found in class WithStaticWithoutMain, please
 * define the main method as: public static void main(String[] args) or a JavaFX
 * application class must extend javafx.application.Application
 */