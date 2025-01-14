package myJava.inheritance;

//Multilevel Inheritance at work
class Parentt {
	int a = 10;

	void a() {
		System.out.println("This is parent class method.");
	}
}

class Child extends Parentt {
	int b = 100;

	void b() {
		System.out.println("This is child class method.");
	}
}

class MultilevelInheritance extends Child {
	int c = 1000;

	void c() {
		System.out.println("This is multilevel inheritance class method.");
	}

	MultilevelInheritance() {
		Parentt a1 = (MultilevelInheritance) this;
		a1.a();
		System.out.println(a1.a);
		super.b();
		System.out.println(super.b);
		this.c();
		System.out.println(this.c);
	}

	public static void main(String[] args) {
		MultilevelInheritance obj = new MultilevelInheritance();
	}
}
/*
 * output This is parent class method. 10 This is child class method. 100 This
 * is multilevel inheritance class method. 1000
 */