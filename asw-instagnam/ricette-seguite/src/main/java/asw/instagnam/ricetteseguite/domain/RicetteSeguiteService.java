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
		RicetteSeguite rs;
		for(Connessione c : connessioniService.getByFollowed(ricetta.getAutore())) {
			rs = new RicetteSeguite();

			rs.setFollower(c.getFollower());
			rs.setIdRicetta(ricetta.getId());
			rs.setAutoreRicetta(ricetta.getAutore());
			rs.setTitoloRicetta(ricetta.getTitolo());

			ricetteSeguiteRepository.save(rs);
		}
	}

	public void updateRicetteSeguite(Connessione connessione) {
		RicetteSeguite rs;
		for(Ricetta r : ricetteService.getByAutore(connessione.getFollowed())) {
			rs = new RicetteSeguite();

			rs.setFollower(connessione.getFollower());
			rs.setIdRicetta(r.getId());
			rs.setAutoreRicetta(r.getAutore());
			rs.setTitoloRicetta(r.getTitolo());

			ricetteSeguiteRepository.save(rs);
		}
	}

	/* Trova le ricette (in formato breve) degli utenti seguiti da utente. */ 
	public Collection<RicetteSeguite> getRicetteSeguite(String utente) {
		Collection<RicetteSeguite> ricetteSeguite = ricetteSeguiteRepository.findAllByFollower(utente);
		return ricetteSeguite;
	}
	
}
