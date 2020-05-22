package asw.instagnam.ricetteseguite.commandlistener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import asw.instagnam.common.api.command.Command;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRicettaCommand implements Command {

	private Long id;
	private String titolo;
	private String autore;

	public String toString() {
		return "[id="+id+", titolo="+titolo+", autore="+autore+"]";
	}
}