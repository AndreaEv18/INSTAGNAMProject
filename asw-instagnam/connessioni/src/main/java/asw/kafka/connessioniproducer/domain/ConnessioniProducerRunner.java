package asw.kafka.connessioniproducer.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConnessioniProducerRunner implements CommandLineRunner {
	
	@Autowired
	private ConnessioniProducerService connessioniProducerService;
	
	@Override
	public void run(String... args) throws Exception {
		String message=null;
		connessioniProducerService.publish(message);
		

	}

}
