package org.discovery.client.stream;

import org.discovery.client.stream.source.MySource2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
*@author   created by hanzhuofan  2018.09.10
*/
@EnableBinding(value = {MySource2.class})
public class SourceSender {
	@Autowired
	private MySource2 mySource2;
	
	void MySource2(Object payload){
		mySource2.output1().send(MessageBuilder.withPayload(payload).build());
		mySource2.output2().send(MessageBuilder.withPayload(payload).build());
		
	}
}
