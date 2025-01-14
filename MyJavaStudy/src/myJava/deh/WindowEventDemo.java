package myJava.deh;

//This program provide sum of two numbers by taking them in the form of textboxes.
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowEventDemo extends WindowAdapter implements ActionListener {
	TextField tf1, tf2, tf3;
	Button b;
	Frame f;

	WindowEventDemo(String ss) {
		f = new Frame(ss);
		tf1 = new TextField();
		tf1.setBounds(40, 40, 20, 20);
		f.add(tf1);
		tf2 = new TextField();
		tf2.setBounds(40, 80, 20, 20);
		f.add(tf2);
		tf3 = new TextField();
		tf3.setBounds(40, 120, 20, 20);
		f.add(tf3);
		b = new Button("Sum");
		b.addActionListener(this);
		b.setBounds(40, 160, 20, 20);
		f.add(b);
		f.addWindowListener(new WindowListeneer());
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String... s) {
		new WindowEventDemo("Sum");
	}

	public void actionPerformed(ActionEvent e) {
		String t1, t2, t3;
		t1 = tf1.getText();
		t2 = tf2.getText();
		int a = Integer.parseInt(t1);
		int b = Integer.parseInt(t2);
		int c = a + b;
		t3 = String.valueOf(c);
		tf3.setText(t3);
	}
}

class WindowListeneer extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
