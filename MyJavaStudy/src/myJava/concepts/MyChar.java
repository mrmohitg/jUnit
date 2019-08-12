package myJava.concepts;

//Use of char data type
class MyChar {
	public static void main(String n[]) {
		char ch1 = '1';
		char ch2 = '2';
		char ch3 = '3';
		char dollar = '\u0024';
		System.out.print(dollar);
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.println(ch3);
		char a1 = 'a';
		char a2 = 'b';
		char a3 = 'c';
		System.out.print(Character.toUpperCase(a1));
		System.out.print(Character.toUpperCase(a2));
		System.out.println(Character.toUpperCase(a3));
	}
}
/*
 * Output $123 ABC
 */