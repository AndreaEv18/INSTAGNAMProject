package asw.kafka.connessioniproducer.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisherImpl implements MessagePublisher {
	
	@Value("${asw.kafka.channel.out}")
	private String channel;
	
	private KafkaTemplate<String, String> template;

	@Override
	public void publish(String message) {
		template.send(channel, message);
		
	}

}
