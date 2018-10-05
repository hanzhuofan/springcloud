package org.eureka.client.thread.locks;

/**
 * 一个Lock类的简单实现
 * 
 * @author Administrator
 *
 */
public class MyLock {
	// private boolean isLocked = false;
	//
	// public synchronized void myLock() throws InterruptedException {
	// while (isLocked) {
	// wait();
	// }
	// isLocked = true;
	// }
	//
	// public synchronized void unlock() {
	// isLocked = false;
	// notify();
	// }
	
	/**
	 * Lock类具有可重入性
	 */
	boolean isLocked = false;
	Thread lockedBy = null;
	int lockedCount = 0;

	public synchronized void lock() throws InterruptedException {
		Thread callingThread = Thread.currentThread();
		while (isLocked && lockedBy != callingThread) {
			wait();
		}
		isLocked = true;
		lockedCount++;
		lockedBy = callingThread;
	}

	public synchronized void unlock() {
		if (Thread.currentThread() == this.lockedBy) {
			lockedCount--;

			if (lockedCount == 0) {
				isLocked = false;
				notify();
			}
		}
	}
}
