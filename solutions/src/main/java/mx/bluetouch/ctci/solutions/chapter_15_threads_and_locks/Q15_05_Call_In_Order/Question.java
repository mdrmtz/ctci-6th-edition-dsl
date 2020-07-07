package mx.bluetouch.ctci.solutions.chapter_15_threads_and_locks.Q15_05_Call_In_Order;

public class Question {
	public static void main(String[] args) {
		FooBad foo = new FooBad();
		
		MyThread thread1 = new MyThread(foo, "first");
		MyThread thread2 = new MyThread(foo, "second");
		MyThread thread3 = new MyThread(foo, "third");
		
		thread3.start();
		thread2.start();
		thread1.start();
	}
}
