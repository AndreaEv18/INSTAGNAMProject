package asw.instagnam.ricetteseguite.domain;

import lombok.*; 

import javax.persistence.*; 

@Entity
@Data @NoArgsConstructor
public class Connessione {

	@Id
	@GeneratedValue
	private Long id; 
	private String follower; 
	private String followed; 
	
}
