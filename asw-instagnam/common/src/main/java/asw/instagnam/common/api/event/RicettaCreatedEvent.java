package asw.instagnam.common.api.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RicettaCreatedEvent implements DomainEvent {

	private Long id;
	private String titolo;
	private String autore;
	
}