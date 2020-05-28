package asw.instagnam.ricetteseguite.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.*; 

public interface RicetteSeguiteRepository extends CrudRepository<RicetteSeguite, Long> {

	public Collection<RicetteSeguite> findAll();

	public RicetteSeguite findByFollower(String follower);

}

