package mx.bluetouch.ctci.library.chapter_15_threads_and_locks.IntroductionSynchronizedBlocks;

public class MyClass extends Thread  {
	private final String name;
	private final MyObject myObj;
	
	public MyClass(MyObject obj, String n) {
		name = n;
		myObj = obj;
	}
	
	public void run() {
		myObj.foo(name);
	}
}
