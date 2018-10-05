package org.eureka.client.thread.thread_signaling;
/**
 * 1、通过共享对象通信
 * 2、忙等待(Busy Wait)
 * @author Administrator
 *
 */
public class MySignal {

	protected boolean hasDataToProcess = false;

	public synchronized boolean hasDataToProcess() {
		return this.hasDataToProcess;
	}

	public synchronized void setHasDataToProcess(boolean hasData) {
		this.hasDataToProcess = hasData;
	}

}
