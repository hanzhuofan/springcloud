package org.eureka.client;

import org.eureka.client.stream.sink.MySink;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Note： 必须在@EnableBinding注解加入新定义的生产消息接口，否则无法被注册； 返回类型必须为MessageChannel；
 * 
 * @author created by hanzhuofan 2018.09.10
 */
@RunWith(SpringRunner.class)
@EnableBinding(value = { EurekaClientAppTest.SinkSender.class })
public class EurekaClientAppTest {
	@Autowired
	private SinkSender sinkSender;

	@Test
	public void sinkSenderTester() {
		sinkSender.output1().send(
				MessageBuilder.withPayload("produce a message to " + MySink.INPUT1_CHANNEL + " channel").build());
		sinkSender.output2().send(
				MessageBuilder.withPayload("produce a message to " + MySink.INPUT2_CHANNEL + " channel").build());
	}

	public interface SinkSender {
		@Output(MySink.INPUT1_CHANNEL)
		MessageChannel output1();

		@Output(MySink.INPUT2_CHANNEL)
		MessageChannel output2();
	}
}
