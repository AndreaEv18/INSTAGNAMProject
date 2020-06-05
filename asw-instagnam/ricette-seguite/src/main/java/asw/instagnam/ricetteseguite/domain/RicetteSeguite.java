package asw.instagnam.ricetteseguite.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*; 

@Entity
@Data @NoArgsConstructor
public class RicetteSeguite {
	
	@Id
	@GeneratedValue
	private Long id;

	private String follower;

	private Long idRicetta;
	private String autoreRicetta;
	private String titoloRicetta;

}
