package org.eureka.client.stream;

import org.eureka.client.stream.sink.MySink;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import ch.qos.logback.classic.Logger;

/**
 * 采用Sink作为默认的消息订阅通道 Note： 将@EnableBinding注解至spring应用的一个配置类中，即可将spring应用变成Spring
 * Cloud Stream应用。@EnableBinding注解本身就包含@Configuration注解，并且会触发Spring Cloud
 * Stream基本配置；
 * 将Sink.class作为@EnableBinding注解的参数，其指定了需要绑定的目标接口； 
 * @StreamListener注解中描述具体监听的通道名称；
 * @author created by hanzhuofan 2018.09.10
 */
@EnableBinding(value = { Sink.class, MySink.class })
public class SinkReceiver {
	private final static Logger logger = (Logger) LoggerFactory.getLogger(SinkReceiver.class);

	@StreamListener(MySink.INPUT1_CHANNEL)
	public void receive1(Object payload) {
		logger.info("Received from {} default channel : {}", MySink.INPUT1_CHANNEL, payload.toString());
	}
	
	@StreamListener(MySink.INPUT2_CHANNEL)
	public void receive2(Object payload) {
		logger.info("Received from {} default channel : {}", MySink.INPUT2_CHANNEL, payload.toString());
	}
}
