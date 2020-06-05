package asw.instagnam.ricetteseguite.rest;

import asw.instagnam.ricetteseguite.domain.*; 

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger; 
import java.util.*;
import java.util.stream.*; 

@RestController
public class RicetteSeguiteController {

	private final Logger logger = Logger.getLogger(RicetteSeguiteController.class.toString()); 

	@Autowired 
	private RicetteSeguiteService ricetteSeguiteService;

	/* Trova le ricette (in formato breve) degli utenti seguiti da utente. */ 
	@GetMapping("/ricetteseguite/{utente}")
	public Collection<RicettaSeguitaBreve> getRicetteSeguite(@PathVariable String utente) {
		logger.info("REST CALL: getRicetteSeguite " + utente); 
		Collection<RicetteSeguite> ricette = ricetteSeguiteService.getRicetteSeguite(utente); 
		logger.info("getRicetteSeguite(): " + ricette);
		return toRicetteSeguiteBrevi(ricette);
	}

	/*Converte una collezione di ricette seguite completa in una collezione di ricette seguite breve*/
	private Collection<RicettaSeguitaBreve> toRicetteSeguiteBrevi(Collection<RicetteSeguite> ricetteSeguiteComplete) {
		Collection<RicettaSeguitaBreve> ricette = 
			ricetteSeguiteComplete
				.stream()
				.map(r -> new RicettaSeguitaBreve(r))
				.collect(Collectors.toList());
		return ricette;
	}
	
}
