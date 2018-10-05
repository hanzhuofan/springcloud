package org.eureka.client.thread.locks;

public class Reentrant {

	public synchronized void outer(){
		inner();
	}

	public synchronized void inner(){
		//do something
	}
}
