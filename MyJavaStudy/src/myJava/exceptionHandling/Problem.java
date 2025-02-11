package myJava.exceptionHandling;

class Salarry extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int Sal;
	String msg;

	Salarry() {
		Sal = 0;
		msg = "Salary Galat Hai.";
		System.out.println(msg + Sal);
	}

	Salarry(int Sal) {
		this.Sal = Sal;
		msg = "Salary Galat Hai.";
		System.out.println(msg + this.Sal);
	}
}

class Problem {
	public static void main(String args[]) {
		int arr[] = { 3000, 50000, -900, 9000 };
		try {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] <= 0 || arr[i] > 100000)
					throw new Salarry(arr[i]);
				System.out.println("Salary is " + arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\10CustomeException>java Problem
 * Salary is 3000 Salary is 50000 Salary Galat Hai.-900 Salary
 */