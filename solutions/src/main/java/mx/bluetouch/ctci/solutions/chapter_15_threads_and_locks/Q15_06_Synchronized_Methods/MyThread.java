package mx.bluetouch.ctci.solutions.chapter_15_threads_and_locks.Q15_06_Synchronized_Methods;

public class MyThread extends Thread {
    private final Foo foo;
    public String name;
    public String firstMethod;

    public MyThread(Foo f, String nm, String fM) {
        foo = f;
        name = nm;
        firstMethod = fM;
    }

    public void run() {
        if (firstMethod.equals("A")) {
            foo.methodA(name);
        } else {
            foo.methodB(name);
        }
    }
}
