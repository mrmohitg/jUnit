package myJava.threading.synchronization.cond2;

class Shared {
	int x;

	synchronized void show(String s, int a) {
		x = a;
		System.out.println("Starting in method " + s + " " + x);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println("Exit from method " + s + " " + x);
	}

	void show1(String s, int a) {
		x = a;
		System.out.println("Starting in method " + s + " " + x);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println("Exit from method " + s + " " + x);
	}
}