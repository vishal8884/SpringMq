package io.vishal.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${Springjms.myQueue}")
	private String queue;
	
	
	public void send(String message) {
		System.out.println("Message being sent :: "+message);
		jmsTemplate.convertAndSend(queue,message); // this is used if we need to send directly
		
//		MessageCreator mc = s -> s.createTextMessage("Hello spring jms");  //in most cases above is used
//		jmsTemplate.send(queue,mc);
	}
}
