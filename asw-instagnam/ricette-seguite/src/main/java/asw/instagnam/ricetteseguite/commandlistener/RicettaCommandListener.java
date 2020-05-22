package asw.instagnam.ricetteseguite.commandlistener;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.messaging.handler.annotation.Payload;

import asw.instagnam.ricetteseguite.domain.CommandHandler;
import asw.instagnam.common.api.command.Command;

@Component
public class RicettaCommandListener {

	@Autowired
	private CommandHandler commandHandler;

	@KafkaListener(topics = "${asw.kafka.channel.ricette.in}", groupId = "${asw.kafka.groupid}")
	public void listen(@Payload Command command) {
		commandHandler.onCommand(command);
	}
}