package asw.instagnam.ricetteseguite.commandlistener;

import lombok.*;

@Getter @Setter
public class CreateRicettaCommand implements Command {

	private Long id;
	private String titolo;
	private String autore;

	public CreateRicettaCommand(Long id, String titolo, String autore) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
	}

	public String toString() {
		return "[id="+id+", titolo="+titolo+", autore="+autore+"]";
	}
}