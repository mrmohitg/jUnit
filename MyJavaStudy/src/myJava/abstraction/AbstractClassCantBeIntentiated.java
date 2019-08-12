package myJava.abstraction;

//Abstract class can't be instantiated
abstract class AbstractClassCantBeIntentiated {
	void Disp() {
		System.out.println("Mohit");
	}

	abstract void Display();

	public static void main(String args[]) {
		/*AbstractClassCantBeIntentiated obj = new AbstractClassCantBeIntentiated();
		obj.Disp();
		obj.Display();*/
	}
}

// We cn't create object of a abstract class.
/*
 * Output AbstractClassCantBeIntentiated.java:11: error:
 * AbstractClassCantBeIntentiated is abstract; cannot be instantiated
 * AbstractClassCantBeIntentiated obj=new AbstractClassCantBeIntentiated(); ^ 1
 * error
 */