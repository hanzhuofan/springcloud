package org.eureka.client.thread.thread_signaling;
/**
 * 7、不要在字符串常量或全局对象中调用wait()
 * @author Administrator
 *
 */
public class MyWaitNotify4 {

	String myMonitorObject = "";
	boolean wasSignalled = false;

	public void doWait(){
	    synchronized(myMonitorObject){
	      while(!wasSignalled){
	        try{
	          myMonitorObject.wait();
	         } catch(InterruptedException e){
	        	 e.printStackTrace();
	         }
	      }
	      //clear signal and continue running.
	      wasSignalled = false;
	    }
	  }

	public void doNotify() {
		synchronized (myMonitorObject) {
			wasSignalled = true;
			myMonitorObject.notify();
		}
	}
}
