package myJava.threading.book;

//To find currently running thread in this program.
class Current {
	public static void main(String... s) {
		System.out.println("Let us find current thread.");
		Thread t = Thread.currentThread();
		System.out.println("Current thread is " + t);
		System.out.println("It's name is " + t.getName());
	}
}