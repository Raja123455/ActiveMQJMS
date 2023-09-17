package com.springBootJMSConcepts.ActiveMQJMS.Consumer;

import com.springBootJMSConcepts.ActiveMQJMS.config.Config;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = Config.ORDER_QUEUE)
    public void processMessage(String message) {
        System.out.println("New message Received -- \n" + message);
    }
}
