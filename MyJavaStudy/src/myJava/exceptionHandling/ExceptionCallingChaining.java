package myJava.exceptionHandling;

//This program shows how we can print all the methods from where the exception has generated and where it has been caught.
//Note: Unchecked Exception are forwarded to the calling chain.
class ExceptionCallingChaining {
	public static void main(String[] jgfn) {
		ExceptionCallingChaining obj = new ExceptionCallingChaining();
		obj.show(6);
	}

	void show(int age) {
		if (age < 18)
			show1();
	}

	void show1() {
		show2();
	}

	void show2() {
		try {
			throw new ArithmeticException("Meri Exception Hai");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\7UncheckedExpCallingChain>java
 * ExceptionCallingChaining java.lang.ArithmeticException: Meri Exception Hai at
 * ExceptionCallingChaining.show2(ExceptionCallingChaining.java:22) at
 * ExceptionCallingChaining.show1(ExceptionCallingChaining.java:16) at
 * ExceptionCallingChaining.show(ExceptionCallingChaining.java:12) at
 * ExceptionCallingChaining.main(ExceptionCallingChaining.java:7)
 */
