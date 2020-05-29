package asw.instagnam.ricetteseguite.domain;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*; 

@Service 
public class RicetteSeguiteService {

	@Autowired
	private RicetteSeguiteRepository ricetteSeguiteRepository;

	@Autowired
	private RicetteService ricetteService;

	@Autowired
	private ConnessioniService connessioniService;

	public void updateRicetteSeguite(Ricetta ricetta) {
		for(Connessione c : connessioniService.getByFollowed(ricetta.getAutore())) {
			RicetteSeguite rs = ricetteSeguiteRepository.findByFollower(c.getFollower());
			if(rs != null) {
				rs.getRicetteSeguite().add(ricetta);
				ricetteSeguiteRepository.save(rs);
			} else
				System.out.println("NULL!!!!");
		}
	}

	public void updateRicetteSeguite(Connessione connessione) {
		RicetteSeguite rs = ricetteSeguiteRepository.findByFollower(connessione.getFollower());
		if(rs != null) {
			rs.getRicetteSeguite().addAll(ricetteService.getByAutore(connessione.getFollowed()));
			ricetteSeguiteRepository.save(rs);
		} else
			System.out.println("NULL!!!!");
	}

	/* Trova le ricette (in formato breve) degli utenti seguiti da utente. */ 
	public Collection<Ricetta> getRicetteSeguite(String utente) {
		return ricetteSeguiteRepository.findByFollower(utente);
	}
	
}
