package asw.kafka.simpleconsumer.domain;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleMessageListener {
	
	@Value("${asw.kafka.channel.ricette.in}")
	private String channelRicette;
	
	@Value("${asw.kafka.channel.connessioni.in}")
	private String channelConnessioni;
	
	@Value("${asw.kafka.groupId}")
	private String groupId;
	
	@Autowired
	private ConsumerService consumerService;
	
	@KafkaListener(topics="${asw.kafka.channel.in}", group="${asw.kafka.groupId}")
	public void listen(ConsumerRecord<String, String> record) throws Exception {
		
		String message= record.value();
		
		consumerService.onMessage(message);
		
	}
	
	
}
