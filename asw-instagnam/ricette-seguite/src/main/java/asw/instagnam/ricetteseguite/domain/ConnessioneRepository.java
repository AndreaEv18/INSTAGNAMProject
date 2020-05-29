package asw.instagnam.ricetteseguite.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.*; 

public interface ConnessioneRepository extends CrudRepository<Connessione, Long> {

	public Collection<Connesione> findByFollowed(String followed);

}
