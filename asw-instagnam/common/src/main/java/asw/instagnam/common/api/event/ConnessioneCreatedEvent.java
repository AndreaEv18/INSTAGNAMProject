package asw.instagnam.common.api.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConnessioneCreatedEvent implements DomainEvent {

	private String follower;
	private String followed;
	
}