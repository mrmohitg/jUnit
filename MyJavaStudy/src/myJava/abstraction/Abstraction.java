package myJava.abstraction;

//Abstraction is working
abstract class Sample {
	int x;
	int y;

	Sample() {
		x = 10;
		y = 20;
	}

	void sum() {
		System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
	}

	abstract void show();
}

class Abstraction extends Sample {
	void show() {
		System.out.println("This is show method of abstraction class.");
	}

	public static void main(String[] args) {
		Sample obj = new Abstraction();
		obj.sum();
		obj.show();
	}
}
/*
 * Output The sum of 10 and 20 is 30 This is show method of abstraction class.
 */
