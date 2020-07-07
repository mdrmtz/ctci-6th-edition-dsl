package mx.bluetouch.ctci.library.chapter_15_threads_and_locks.IntroductionLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockedATM {
	private final Lock lock;
	private int balance = 100;
	
	public LockedATM() {
		lock = new ReentrantLock();
	}
	
	public int withdraw(int value) {
		lock.lock();
		int temp = balance;
		try {
			Thread.sleep(100);
			temp = temp - value;
			Thread.sleep(100);
			balance = temp;
		} catch (InterruptedException e) {		}
		lock.unlock();
		return temp;
	}
	
	public int deposit(int value) {
		lock.lock();
		int temp = balance;
		try {
			Thread.sleep(100);
			temp = temp + value;
			Thread.sleep(100);
			balance = temp;
		} catch (InterruptedException e) {		}
		lock.unlock();
		return temp;
	} 
	
	public int getBalance() {
		return balance;
	}
}
