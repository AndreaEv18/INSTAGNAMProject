package asw.instagnam.ricetteseguite.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/* ricetta seguita in formato breve */
@Data @NoArgsConstructor
public class RicettaSeguitaBreve {

	private Long id;
	private String autore;
	private String titolo;

	public RicettaSeguitaBreve(RicetteSeguite ricetta) {
		this();
		this.id = ricetta.getIdRicetta();
		this.autore = ricetta.getAutoreRicetta();
		this.titolo = ricetta.getTitoloRicetta();
	}

}
