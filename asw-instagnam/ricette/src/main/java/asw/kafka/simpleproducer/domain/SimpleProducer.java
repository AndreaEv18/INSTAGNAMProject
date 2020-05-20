package asw.kafka.simpleproducer.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.PostMapping;

public class SimpleProducer implements CommandLineRunner {
	
	@Autowired
	private SimpleProducerService simpleProducerService;

	@Override
	public void run(String... args) throws Exception {
		String message=null;
		
		simpleProducerService.publish(message);
		
	}
	
	

}
