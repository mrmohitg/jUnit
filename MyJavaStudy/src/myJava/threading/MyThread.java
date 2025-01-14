package myJava.threading;

public class MyThread {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Main Thread Dead:" + Thread.currentThread().getName());
	}
}