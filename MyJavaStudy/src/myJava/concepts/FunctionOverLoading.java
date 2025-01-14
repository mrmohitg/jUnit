package myJava.concepts;

//WAP to perform function overloading
class Sample {
	void add(int a) {
		System.out.println("The value of a = " + a);
	}

	void add(int a, int b) {
		System.out.println("Sum of two = " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("Sum of Three = " + (a + b + c));
	}
}

class FunctionOverLoading {
	public static void main(String args[]) {
		Sample s = new Sample();
		s.add(10);
		s.add(10, 10);
		s.add(100, 100, 100);
	}
}
/*
 * Output The value of a = 10 Sum of two = 20 Sum of Three = 300
 */