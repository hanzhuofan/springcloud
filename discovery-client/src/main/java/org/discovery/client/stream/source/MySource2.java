package org.discovery.client.stream.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
*@author   created by hanzhuofan  2018.09.10
*/
public interface MySource2 {
	String OUTPUT1_CHANNEL="eureka-client1";
	String OUTPUT2_CHANNEL="eureka-client2";
	
	@Output(MySource2.OUTPUT1_CHANNEL)
	MessageChannel output1();
	
	@Output(MySource2.OUTPUT2_CHANNEL)
	MessageChannel output2();
}
