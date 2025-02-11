package myJava.threading;

class Thread1 extends Thread {
	Thread1(String s) {
		super(s);
	}

	public void run() {
		System.out.println("Started " + getName());
		try {
			Thread.sleep(100000);
		} catch (Exception e) {
		}
		System.out.println("Ended " + getName());
	}
}

class Thread2 extends Thread {
	Thread2(String s) {
		super(s);
	}

	public void run() {
		System.out.println("Started " + getName());
		try {
			Thread.sleep(100000);
		} catch (Exception e) {
		}
		System.out.println("Ended " + getName());
	}
}

class DaemonMethod {
	public static void main(String... s) {
		Thread1 t1 = new Thread1("Thread1");
		Thread2 t2 = new Thread2("Thread2");
		try {
			t1.setDaemon(true);
			t2.setDaemon(true);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Started " + Thread.currentThread().getName());

		t1.start();
		t2.start();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		System.out.println("Ended " + Thread.currentThread().getName());
		System.out.println("isDaemon() is called on Thread1 and its result is " + t1.isDaemon());
		System.out.println("isDaemon() is called on Thread2 and its result is " + t2.isDaemon());
	}
}