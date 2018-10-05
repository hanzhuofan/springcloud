package org.eureka.client.thread.thread;

public class ThreadTest {

	public static void main(String[] args) {
		Object lock = new Object();
		Thread A = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					System.out.println("A 1");
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("A 2");
					System.out.println("A 3");
					lock.notify();
					System.out.println("A 4");
					System.out.println("A 5");
					System.out.println("A 6");
				}
			}
		});
		Thread B = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					System.out.println("B 1");
					System.out.println("B 2");
					System.out.println("B 3");
					lock.notify();
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("B 4");
					System.out.println("B 5");
					System.out.println("B 6");
				}
			}
		});
		A.start();
		B.start();
		
	}
}
