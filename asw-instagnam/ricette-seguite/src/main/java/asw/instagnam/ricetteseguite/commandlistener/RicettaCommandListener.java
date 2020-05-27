package asw.instagnam.ricetteseguite.commandlistener;
 

import org.apache.kafka.clients.consumer.ConsumerRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.instagnam.ricetteseguite.domain.CommandHandler;
import asw.instagnam.common.api.event.DomainEvent;


@Component
public class RicettaCommandListener {

	@Autowired
	private CommandHandler commandHandler;

	@KafkaListener(topics = "${asw.kafka.channel.ricette.in}", groupId = "${asw.kafka.groupid}")
	public void listen(ConsumerRecord<String, DomainEvent> record) {
		commandHandler.onEvent(record.value());
	}
}