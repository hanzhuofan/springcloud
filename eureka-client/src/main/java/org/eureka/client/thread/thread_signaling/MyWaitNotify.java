package org.eureka.client.thread.thread_signaling;
/**
 * 3、wait(),notify()和notifyAll()
 * @author Administrator
 *
 */
public class MyWaitNotify {

	MonitorObject myMonitorObject = new MonitorObject();

	public void doWait(){
	    synchronized(myMonitorObject){
	      try{
	        myMonitorObject.wait();
	      } catch(InterruptedException e){
	    	  e.printStackTrace();
	      }
	    }
	  }

	public void doNotify() {
		synchronized (myMonitorObject) {
			myMonitorObject.notify();
		}
	}
}
