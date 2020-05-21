package asw.instagnam.ricette.domain;

import asw.instagnam.ricette.eventpublisher.DomainEvent;

public interface RicettaCreatedEventPublisher {

	public void publish(DomainEvent event);

}