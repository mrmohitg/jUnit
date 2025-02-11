package myJava.concepts;

//To accept a persons name and display if he is young ,middle aged or old.
import java.io.*;

class Perrson {
	String name;
	int age;

	public void accept() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the Person.");
		name = br.readLine();
		System.out.println("Enter the age of the Person.");
		age = Integer.parseInt(br.readLine());
	}

	public void check() {
		if (age <= 30)
			System.out.println(name + " is young.");
		else if (age <= 50)
			System.out.println(name + " is middle aged.");
		else
			System.out.println(name + " is old.");
	}
}

public class UseOfMethods {
	public static void main(String args[]) throws IOException {
		Perrson obj1 = new Perrson();
		obj1.accept();
		obj1.check();
	}
}
/*
 * Output Enter the name of the Person. Mohit Enter the age of the Person. 27
 * Mohit is young.
 */