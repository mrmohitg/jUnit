package myJava.exceptionHandling;

//Checked Exceptions are known to compiler so it is necessary to write them inside try catch block.
class CheckedException {
	public static void main(String... ss) {
		try {
			int a = System.in.read();
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\3HandledCheckedException>java
 * CheckedException f 102
 */