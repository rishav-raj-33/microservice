package com.notify.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.client.RestTemplate;



@Configuration
public class KafkaConsumer {


	
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	private static final RestTemplate restTemplate=new RestTemplate();
	
	
	@KafkaListener(topics = "studentChannel",groupId="group-1")
	public void Notify(String message){
		  logger.info("Received message from Kafka: {}", message);
		  notifyStudent();
	}


    @KafkaListener(topics =  "channel2",groupId = "group-1")
    public void notifyChannel2(String message){
        logger.info(message+" from channel two");
    logger.info("----------------------------------------------");
    }


	public void notifyStudent() {
		String url = "http://localhost:8080/api/students/verify";
	    ResponseEntity<Void> response = restTemplate.postForEntity(
	            url,
	            "Notification Received in Notification Service",
	            Void.class
	    );	    
	   if (response.getStatusCode().equals(HttpStatus.OK))
		logger.info("Message Received at Student Service");
	}
	
	
	
	
	
}
