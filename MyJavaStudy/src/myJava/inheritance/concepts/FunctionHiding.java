package myJava.inheritance.concepts;

//In inheritance when both parent and child class has same static function that is known as FunctionHiding.
class Basee {
	static void show() {
		System.out.println("Static Show Function of Base Class.");
	}
}

class FunctionHiding extends Basee {
	static void show() {
		System.out.println("Static Show Function of Function Hiding Class.");
	}

	public static void main(String... s) {
		FunctionHiding obj = new FunctionHiding();
		System.out.println("Through Object of Child class and child class reference variable.");
		obj.show();
		Base b = new Base();
		System.out.println("Through Object of Base class and base class reference variable.");
		b.show();
		Basee b2 = new FunctionHiding();
		System.out.println("Through Object of child class but base class reference variable.");
		b2.show();
		System.out.println("Direct Parent");
		Basee.show();
		System.out.println("Direct Child");
		FunctionHiding.show();
	}
}
/*
 * Output Through Object of Child class and child class reference variable.
 * Static Show Function of Function Hiding Class. Through Object of Base class
 * and base class reference variable. Static Show Function of Base Class.
 * Through Object of child class but base class reference variable. Static Show
 * Function of Base Class. Direct Parent Static Show Function of Base Class.
 * Direct Child Static Show Function of Function Hiding Class.
 */