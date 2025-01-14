package myJava.inheritance.concepts;

//To access the private data member of the class
class Base {
	private int x = 10;

	void show() // either make this method as public, default, protected this can be accessable
				// in main.
	{
		System.out.println(x);
	}
}

class PrivateDataMemberAccess extends Base {
	public static void main(String args[]) {
		PrivateDataMemberAccess obj = new PrivateDataMemberAccess();
		obj.show();
	}
}
/*
 * Output 10
 */