package asw.instagnam.ricette.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.logging.Logger; 
import java.util.*; 

import asw.instagnam.ricette.eventpublisher.RicettaCreatedEvent;
import asw.instagnam.common.api.event.DomainEvent;

@Service
public class RicetteService {

	@Autowired
	private RicetteRepository ricetteRepository;

	@Autowired
	private RicettaCreatedEventPublisher eventPublisher;

 	public RicettaCompleta createRicetta(String autore, String titolo, String preparazione) {
		RicettaCompleta ricetta = new RicettaCompleta(autore, titolo, preparazione); 
		ricetta = ricetteRepository.save(ricetta);
		DomainEvent ricettaCreatedEvent = new RicettaCreatedEvent(ricetta.getId(), ricetta.getTitolo(), ricetta.getAutore());
		eventPublisher.publish(ricettaCreatedEvent);
		return ricetta;
	}

 	public RicettaCompleta getRicetta(Long id) {
		RicettaCompleta ricetta = ricetteRepository.findById(id).orElse(null);
		return ricetta;
	}

	public Collection<RicettaCompleta> getRicette() {
		Collection<RicettaCompleta> ricette = ricetteRepository.findAll();
		return ricette;
	}

	public Collection<RicettaCompleta> getRicetteByAutore(String autore) {
		Collection<RicettaCompleta> ricette = ricetteRepository.findAllByAutore(autore);
		return ricette;
	}

}
