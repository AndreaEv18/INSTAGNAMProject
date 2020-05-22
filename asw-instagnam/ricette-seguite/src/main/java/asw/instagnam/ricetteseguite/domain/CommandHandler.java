package asw.instagnam.ricetteseguite.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import asw.instagnam.common.api.command.Command;

@Service
public class CommandHandler {

	@Value("${asw.kafka.channel.ricette.in}")
	private String ricetteChannel;

	@Value("${asw.kafka.channel.connessioni.in}")
	private String connessioniChannel;

	public void onCommand(Command command) {
		System.out.println("RICEVUTO!!!");
		System.out.println(command.toString());
	}
}