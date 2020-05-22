package asw.instagnam.ricette.eventpublisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import asw.instagnam.common.api.event.DomainEvent;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RicettaCreatedEvent implements DomainEvent {

	private Long id;
	private String titolo;
	private String autore;
	
}