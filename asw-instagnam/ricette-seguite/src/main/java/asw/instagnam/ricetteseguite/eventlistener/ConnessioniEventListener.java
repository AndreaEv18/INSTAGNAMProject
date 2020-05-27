package asw.instagnam.ricetteseguite.eventlistener;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.instagnam.ricetteseguite.domain.EventHandler;
import asw.instagnam.common.api.event.DomainEvent;


@Component
public class ConnessioniEventListener {

	@Autowired
	private EventHandler eventHandler;

	@KafkaListener(topics = "${asw.kafka.channel.connessioni.in}", groupId = "${asw.kafka.groupid}")
	public void listen(ConsumerRecord<String, DomainEvent> record) {
		eventHandler.onEvent(record.value());
	}

}