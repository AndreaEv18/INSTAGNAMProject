package asw.instagnam.ricetteseguite.commandlistener;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

import asw.instagnam.ricetteseguite.domain.CommandHandler;

@Component
public class RicettaCommandListener {

	@Autowired
	private CommandHandler commandHandler;

	@KafkaListener(topics = "${asw.kafka.channel.ricette.in}", groupId = "${asw.kafka.groupid}")
	public void onCommand(ConsumerRecord<String, CreateRicettaCommand> record) throws Exception {
		commandHandler.onCommand(record.value());
	}
}