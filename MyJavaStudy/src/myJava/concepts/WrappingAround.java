package myJava.concepts;

//Wrapping around of data in smaller type.
class WrappingAround {
	public static void main(String args[]) {
		int i = 128;
		byte b = (byte) i;
		System.out.println(b);
	}
}
/*
 * Output -128
 */