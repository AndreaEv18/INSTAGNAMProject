package asw.instagnam.ricetteseguite.domain;

import lombok.*;

import java.util.List; 

import javax.persistence.*; 

/* Ricetta (in formato breve). */
@Entity
@Data @NoArgsConstructor
public class Ricetta {
	
	@Id 
	private Long id; 
	private String autore; 
	private String titolo;

	@Singular
	@OneToMany 
	@JoinColumn(name="id", referencedColumnName="id")
	private List<RicetteSeguite> ricetteSeguite;

}
