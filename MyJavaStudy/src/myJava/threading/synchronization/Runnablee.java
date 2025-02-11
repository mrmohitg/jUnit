package myJava.threading.synchronization;

class CallMe {
	int t;

	synchronized void call(int msg) {
		this.t = msg;
		System.out.println("Enter Time " + t);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("Out Time " + t);
	}
}

class Caller implements Runnable {
	CallMe target;
	Thread t;
	int msg;

	public Caller(CallMe target, int s) {
		this.target = target;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		target.call(msg);
	}
}

class Runnablee {
	public static void main(String... s) {
		CallMe c = new CallMe();
		Caller obj1 = new Caller(c, 10);
		Caller obj2 = new Caller(c, 20);
		Caller obj3 = new Caller(c, 30);
	}
}