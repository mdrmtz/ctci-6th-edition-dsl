package mx.bluetouch.ctci.library.chapter_15_threads_and_locks.IntroductionB;

public class ExampleB {
	public static void main(String[] args) {
		ThreadExample instance = new ThreadExample();
		instance.start();
		
		while (instance.count != 5) {		
			try {
				Thread.sleep(250);
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}
	}
}
