package myJava.strings;

//This program shows the immutable capability of the string 
class Immutable {
	public static void main(String args[]) {
		String s1 = "Data";
		String s2 = "Base";
		s1 = s1 + s2;
		System.out.println(s1);
	}
}
/*
 * Output DataBase
 */