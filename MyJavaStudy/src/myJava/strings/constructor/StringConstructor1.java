package myJava.strings.constructor;

//This program shows the String class constructor which accepts char type array.
class StringConstructor1 {
	public static void main(String[] args) {
		char c[] = { 'm', 'o', 'h', 'i', 't' };
		String s = new String(c);
		System.out.println("String Class Constructor via Char Type Array :" + s);
	}
}
/*
 * Output D:\Work\Java\Code\40StringHandling\1String\2StringConstructor>java
 * StringConstructor1 String Class Constructor via Char Type Array :mohit
 */