package asw.kafka.connessioniproducer.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConnessioniProducerService {
	
	@Autowired
	private MessagePublisher messagePublisher;
	
	public void publish(String message) {
		messagePublisher.publish(message);
	}

}
