package myJava.garbageCollection;

//Reusing the referrence in finalize method.
class Ex {
	static Ex e;
	int x = 10;
	int y = 20;

	public void finalize() throws Throwable {
		e = this;
		System.out.println(e.x);
		System.out.println(e.y);
	}

	public static void main(String... s) {
		for (int i = 0; i < 200; i++) {
			new Ex();
			System.gc();
		}
	}
}
/*
 * Output 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10
 * 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20 10 20
 */