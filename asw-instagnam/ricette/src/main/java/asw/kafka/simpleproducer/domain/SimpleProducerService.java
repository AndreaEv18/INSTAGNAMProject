package asw.kafka.simpleproducer.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleProducerService {
	
	@Autowired
	private SimpleMessageProducer simpleMessageProducer;
	
	
	public void publish(String message) {
		simpleMessageProducer.publish(message);
		
	}

}
