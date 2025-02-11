package myJava.threading.synchronization.cond1;

class CustomeThread extends Thread {
	Shared s;

	public CustomeThread(Shared s, String str) {
		super(str);
		this.s = s;
		start();
	}

	public void run() {
		s.show(Thread.currentThread().getName(), 10);
	}
}

class CustomeThread1 extends Thread {
	Shared s;

	public CustomeThread1(Shared s, String str) {
		super(str);
		this.s = s;
		start();
	}

	public void run() {
		s.show1(Thread.currentThread().getName(), 20);
	}
}