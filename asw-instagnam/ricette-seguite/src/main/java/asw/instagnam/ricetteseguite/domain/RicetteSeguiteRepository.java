package asw.instagnam.ricetteseguite.domain;

import org.springframework.data.repository.CrudRepository;

public interface RicetteSeguiteRepository extends CrudRepository<RicetteSeguite, Long> {

	public RicetteSeguite findByFollower(String follower);

}