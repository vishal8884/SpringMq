package io.vishal.mq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMqApplicationTests {
	
	@Autowired
	MessageSender sender;

	@Test
	public void sendAndReceive() {
		sender.send("Hello spring jms");
	}

}
