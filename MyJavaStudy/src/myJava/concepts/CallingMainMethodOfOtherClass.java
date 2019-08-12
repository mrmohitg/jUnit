package myJava.concepts;

//Calling main() of a Class CallingMainMethodOfOtherClass2 from another class CallingMainMethodOfOtherClass
class CallingMainMethodOfOtherClass2 {
	public static void main(String args[]) {
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);
	}
}

public class CallingMainMethodOfOtherClass {
	public static void main(String args[]) {
		String name[] = { "Ram", "Shyam" };
		CallingMainMethodOfOtherClass2.main(name);
	}
}
/*
 * Output Ram Shyam
 */