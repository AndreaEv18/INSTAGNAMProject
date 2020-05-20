package asw.kafka.simpleproducer.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class SimpleMessagePublisherImpl implements SimpleMessageProducer {

	@Value("${asw.kafka.channel.out}")
	private String channel;
	
	private KafkaTemplate<String, String> template;
	
	@Override
	public void publish(String message) {
		template.send(channel, message);
		
		
	}

}
