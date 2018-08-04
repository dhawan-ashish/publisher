package kafka.learning.publisher;

import java.util.Properties;

import org.apache.kafka.clients.producer.*;

public class KafkaPublisher {
	
	public void publish() {
		
		 Properties props = new Properties();
		 props.put("bootstrap.servers", "localhost:9092");
		 props.put("acks", "all");
		 props.put("retries", 0);
		 props.put("batch.size", 16384);
		 props.put("linger.ms", 1);
		 props.put("buffer.memory", 33554432);
		 props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		 props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		 Producer<String, String> producer = new KafkaProducer<String, String>(props);
		 for (int i = 100; i < 200; i++)
		     producer.send(new ProducerRecord<String, String>("test", Integer.toString(i), Integer.toString(i)));

		 producer.close();
	}

}
