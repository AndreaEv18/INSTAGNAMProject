package asw.instagnam.ricetteseguite.domain;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import asw.instagnam.common.api.event.*;

import java.util.logging.*;

@Service
public class EventHandler {

	private final Logger logger = Logger.getLogger(EventHandler.class.toString());

	@Autowired
	private RicetteService ricetteService;

	@Autowired
	private ConnesioniService connessioniService;

	public void onEvent(DomainEvent event) {
		if(event.getClass().equals(RicettaCreatedEvent.class)) {
			RicettaCreatedEvent rce = (RicettaCreatedEvent) event;
			ricettaCreated(rce);
		} else if(event.getClass().equals(ConnessioneCreatedEvent.class)) {
			ConnessioneCreatedEvent cce = (ConnessioneCreatedEvent) event;
			connessioneCreated(cce);
		} else {
			logger.warning("UNKNOW EVENT: "+event);
		}
	}

	private void ricettaCreated(RicettaCreatedEvent event) {
		Ricetta ricetta = new Ricetta();
		ricetta.setId(event.getId());
		ricetta.setAutore(event.getAutore());
		ricetta.setTitolo(event.getTitolo());

		ricetteService.add(ricetta);
	}

	private void connessioneCreated(ConnessioneCreatedEvent event) {
		Connessione connessione = new Connessione();
		connessione.setFollower(event.getFollower());
		connessione.setFollowed(event.getFollowed());

		connessioniService.add(connessione);
	}

}