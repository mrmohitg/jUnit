package myJava.strings.constructor;

//This program shows string class constructor which accepts byte tpe array. 
class StringConstructor4 {
	public static void main(String[] args) {
		byte c[] = { 'm', 'o', 'h', 'i', 't' };
		String s = new String(c);
		System.out.println("String Class Constructor via Byte Array : " + s);
	}
}
/*
 * Output D:\Work\Java\Code\40StringHandling\1String\2StringConstructor>java
 * StringConstructor4 String Class Constructor via Byte Array : mohit
 */