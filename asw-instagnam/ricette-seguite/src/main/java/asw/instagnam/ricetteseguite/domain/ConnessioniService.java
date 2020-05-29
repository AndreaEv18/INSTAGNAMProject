package asw.instagnam.ricetteseguite.domain;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*; 

@Service 
public class ConnessioniService {

	@Autowired
	private ConnessioneRepository connessioneRepository;

	@Autowired
	private RicetteSeguiteService ricetteSeguiteService;

	public Connessione add(final Connessione connessione) {
		connessione = connessioneRepository.save(connessione);
		ricetteSeguiteService.updateRicetteSeguite(connessione);
		return connessione;
	}

	public Collection<Connessione> getByFollowed(String followed) {
		return connessioneRepository.findByFollowed(followed);
	}
	
}
 
