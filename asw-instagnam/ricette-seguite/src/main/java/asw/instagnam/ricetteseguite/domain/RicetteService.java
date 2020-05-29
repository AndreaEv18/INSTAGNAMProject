package asw.instagnam.ricetteseguite.domain;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*; 

@Service 
public class RicetteService {

	@Autowired
	private RicettaRepository ricettaRepository;

	@Autowired
	private RicetteSeguiteService ricetteSeguiteService;

	public Ricetta add(final Ricetta ricetta) {
		ricetta = ricettaRepository.save(ricetta);
		ricetteSeguiteService.updateRicetteSeguite(ricetta);
		return ricetta;
	}
	
	public Collection<Ricetta> getByAutore(String autore) {
		return ricettaRepository.findAllByAutore(autore);
	}
	
}
 
