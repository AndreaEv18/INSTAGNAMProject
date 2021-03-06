package asw.instagnam.ricetteseguite.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection; 

public interface RicettaRepository extends CrudRepository<Ricetta, Long> {

	public Collection<Ricetta> findAllByAutore(String autore);

}
