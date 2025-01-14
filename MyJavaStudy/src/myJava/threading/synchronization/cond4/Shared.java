package myJava.threading.synchronization.cond4;

class Shared {
	static int x;

	static synchronized void show(String s, int a) {
		x = a;
		System.out.println("Starting in method " + s + " " + x);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println("Exit from method " + s + " " + x);
	}
}