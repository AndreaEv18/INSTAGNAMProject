package asw.instagnam.ricetteseguite.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection; 

public interface RicetteSeguiteRepository extends CrudRepository<RicetteSeguite, Long> {

	public Collection<RicetteSeguite> findAllByFollower(String follower);

}