package com.springBootJMSConcepts.ActiveMQJMS.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@Configuration
public class Config {
    public static final String ORDER_QUEUE = "order.queue";


    @Bean
    public ActiveMQQueue queue()
    {
        try{
            return new ActiveMQQueue(ORDER_QUEUE);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}