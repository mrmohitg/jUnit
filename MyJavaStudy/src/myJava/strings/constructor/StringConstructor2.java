package myJava.strings.constructor;

//This program shows string class constructor which accepts char array and the starting index of the array and the length. 
class StringConstructor2 {
	public static void main(String[] args) {
		char c[] = { 'm', 'o', 'h', 'i', 't' };
		String s = new String(c, 2, 3);
		System.out.println("String Class Constructor Which Create Substring : " + s);
	}
}
/*
 * Output D:\Work\Java\Code\40StringHandling\1String\2StringConstructor>java
 * StringConstructor2 String Class Constructor Which Create Substring : hit
 */