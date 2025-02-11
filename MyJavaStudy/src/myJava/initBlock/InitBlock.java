package myJava.initBlock;

//Init Block in action always when new object is created
class InitBlock {
	InitBlock() {
		System.out.println("Default Constructor");
	}

	{
		System.out.println("1st Init Block");
	}
	{
		System.out.println("2nd Init Block");
	}
	{
		System.out.println("3rd Init Block");
	}

	public static void main(String args[]) {
		InitBlock obj = new InitBlock();
		new InitBlock();
	}
}
/*
 * Output 1st Init Block 2nd Init Block 3rd Init Block Default Constructor 1st
 * Init Block 2nd Init Block 3rd Init Block Default Constructor
 */