package org.eureka.client.stream.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * input通道
 * @author created by hanzhuofan 2018.09.10
 */
public interface MySink {
	String INPUT1_CHANNEL="eureka-client1";
    String INPUT2_CHANNEL="eureka-client2";
 
    @Input(INPUT1_CHANNEL)
    SubscribableChannel input1();
 
    @Input(INPUT2_CHANNEL)
    SubscribableChannel input2();
}
