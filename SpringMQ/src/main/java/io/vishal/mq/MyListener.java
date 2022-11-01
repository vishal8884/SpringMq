package io.vishal.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
	
	@JmsListener(destination = "${Springjms.myQueue}")  //it reads from above and injects to message below
	public void receive(String message) {
		System.out.println("Message received :: "+message);
	}

}
