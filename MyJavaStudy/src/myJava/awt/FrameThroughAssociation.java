package myJava.awt;

//This program shows to create a Frame with the association.
import java.awt.Frame;

class FrameThroughAssociation {
	Frame f;

	FrameThroughAssociation(String ss) {
		Frame f = new Frame(ss);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String... s) {
		new FrameThroughAssociation("First Frame");
	}
}
/*
 * Output The basic frame will appear.
 */