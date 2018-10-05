package org.eureka.client.thread.locks;

public class Reentrant2 {

	MyLock myLock = new MyLock();
	java.util.concurrent.locks.Lock locks;

	public void outer() throws InterruptedException{
		myLock.lock();
		inner();
		myLock.unlock();
	}

	public synchronized void inner() throws InterruptedException{
		myLock.lock();
		//do something
		myLock.unlock();
	}
}
