package myJava.exceptionHandling;

public class PippedException {
	static void show() {
		throw new ArithmeticException();
	}

	static void display() {
		throw new ArrayIndexOutOfBoundsException();
	}

	static void fun() {
		throw new StringIndexOutOfBoundsException();
	}

	static void bun() {
		throw new NumberFormatException();
	}

	public static void main(String[] args) {
		try {
			PippedException.show();
			PippedException.display();
		} catch (Exception e) {
			if (e instanceof ArrayIndexOutOfBoundsException || e instanceof ArithmeticException) {
				System.out.println("The program stops because of AIOOBE or AE.");
			}
		}
		try {
			PippedException.fun();
			PippedException.bun();
		} catch (Exception e) {
			if (e instanceof NumberFormatException || e instanceof StringIndexOutOfBoundsException) {
				System.out.println("The program stops because of NFE or NPE");
			}
		}

	}

}
