package mx.bluetouch.ctci.library.chapter_15_threads_and_locks.IntroductionLocks;

import mx.bluetouch.ctci.library.AssortedMethods;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyClass extends Thread {
    private final NoLockATM noLockATM;
    private final LockedATM lockedATM;
    public int delta = 0;

    private final Lock completionLock;

    public MyClass(NoLockATM atm1, LockedATM atm2) {
        noLockATM = atm1;
        lockedATM = atm2;
        completionLock = new ReentrantLock();
    }

    public void run() {
        completionLock.lock();
        int[] operations = AssortedMethods.randomArray(20, -50, 50);
        for (int op : operations) {
            delta += op;
            if (op < 0) {
                int val = op * -1;
                noLockATM.withdraw(val);
                lockedATM.withdraw(val);
            } else {
                noLockATM.deposit(op);
                lockedATM.deposit(op);
            }
        }
        completionLock.unlock();
    }

    public void waitUntilDone() {
        completionLock.lock();
        completionLock.unlock();
    }
}
