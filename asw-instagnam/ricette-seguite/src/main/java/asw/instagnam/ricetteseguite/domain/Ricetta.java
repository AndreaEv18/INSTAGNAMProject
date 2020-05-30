package asw.instagnam.ricetteseguite.domain;

import lombok.*;

import javax.persistence.*; 

/* Ricetta (in formato breve). */
@Entity
@Data @NoArgsConstructor
public class Ricetta {
	
	@Id 
	private Long id; 
	private String autore; 
	private String titolo;

}
