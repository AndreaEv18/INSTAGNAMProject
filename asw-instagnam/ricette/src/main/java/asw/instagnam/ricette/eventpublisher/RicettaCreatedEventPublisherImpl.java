package asw.instagnam.ricette.eventpublisher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import asw.instagnam.ricette.domain.RicettaCreatedEventPublisher;
import asw.instagnam.common.api.event.DomainEvent;

@Component
public class RicettaCreatedEventPublisherImpl implements RicettaCreatedEventPublisher {

	@Autowired
	private KafkaTemplate<String, DomainEvent> template;

	@Value("${asw.kafka.channel.ricette.out}")
	private String channel;

	public void publish(DomainEvent event) {
		template.send(channel, event);
	}
}