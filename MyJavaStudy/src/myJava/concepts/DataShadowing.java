package myJava.concepts;

//Data Shadowing Concept is working
class DataShadowing {
	int x = 10;

	public void getInteger() {
		int x = 100;
		System.out.println("Local value of x is " + x);
		System.out.println("Class level value of x is " + this.x); // Data Shadowing..............................
	}

	public static void main(String arr[]) {
		DataShadowing obj = new DataShadowing();
		obj.getInteger();
	}
}
/*
 * Output Local value of x is 100 Class level value of x is 10
 */