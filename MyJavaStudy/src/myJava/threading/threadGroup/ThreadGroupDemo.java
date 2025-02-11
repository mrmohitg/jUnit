package myJava.threading.threadGroup;

class Thread1 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started");
		try {
			Thread.sleep(200000);
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() + " Dead");
	}
}

class Thread2 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started");
		try {
			Thread.sleep(200000);
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() + " Dead");
	}
}

class ThreadGroupDemo {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Group");
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread tt = new Thread(tg, t1);
		Thread ttt = new Thread(tg, t2);
		System.out.println("Started " + Thread.currentThread().getName());
		tt.start();
		ttt.start();
		tg.interrupt();
		System.out.println("Ended " + Thread.currentThread().getName());
	}
}