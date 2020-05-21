package asw.instagnam.ricette.eventpublisher;

import lombok.*;

@Getter @Setter
public class RicettaCreatedEvent implements DomainEvent {

	private Long id;
	private String titolo;
	private String autore;

	public RicettaCreatedEvent(Long id, String titolo, String autore) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
	}
	
}