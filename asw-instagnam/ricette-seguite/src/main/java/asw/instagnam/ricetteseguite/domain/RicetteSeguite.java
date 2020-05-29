package asw.instagnam.ricetteseguite.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.util.List;

import javax.persistence.*; 

@Entity
@Data @NoArgsConstructor
public class RicetteSeguite {
	
	@Id
	@GeneratedValue
	private Long id;
	private String follower;

	@Singular
	@OneToMany
	@JoinColumn(name="id", referencedColumnName="id", insertable=false, updatable=false)
	private List<Ricetta> ricetteSeguite;

}
