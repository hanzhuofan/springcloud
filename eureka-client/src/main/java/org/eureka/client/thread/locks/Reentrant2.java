package org.eureka.client.thread.locks;

public class Reentrant2 {

	Lock lock = new Lock();
	java.util.concurrent.locks.Lock locks;

	public void outer() throws InterruptedException{
		lock.lock();
		inner();
		lock.unlock();
	}

	public synchronized void inner() throws InterruptedException{
		lock.lock();
		//do something
		lock.unlock();
	}
}
