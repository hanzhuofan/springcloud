package org.eureka.client.thread.locks;
/**
 * 一个简单的锁
 * 
 * @author Administrator
 *
 */
public class Counter {

	// private int count = 0;
	// //一个同步块开始
	// public int inc() {
	// synchronized (this) {
	// return ++count;
	// }
	// }

	/**
	 * 用Lock代替synchronized达到了同样的目的
	 */
	private MyLock myLock = new MyLock();
	private int count = 0;

	public int inc() throws InterruptedException {
		myLock.lock();
		int newCount = ++count;
		myLock.unlock();
		return newCount;
	}

	
}
