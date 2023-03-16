package com.rabbitmq.rabbitListener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println("Received a new message = [" + new String(message.getBody()) + "]");
    }
}
