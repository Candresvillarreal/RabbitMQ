package com.rabbitmq.rabbitListener;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfiguration {

    @Bean
    Queue exampleFirstQueue() {
        return new Queue("ExampleFirstQueue", false);
    }

    @Bean
    Queue exampleSecondQueue() {
        return QueueBuilder.durable("ExampleSecondQueue")
                .autoDelete()
                .exclusive()
                .build();
    }
}
