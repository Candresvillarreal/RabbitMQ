package com.rabbitmq.rabbitListener;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {

    @Bean
    Exchange example1stExchange() {
        return new TopicExchange("example1stExchange");
    }

    @Bean
    Exchange example2ndExchange() {
        return ExchangeBuilder.directExchange("example2ndExchange")
                .autoDelete()
                .internal()
                .build();
    }

    @Bean
    Exchange newExchange() {
        return ExchangeBuilder.topicExchange("TopicTestExchange")
                .autoDelete()
                .durable(true)
                .internal()
                .build();
    }

    @Bean
    Exchange fanoutExchange() {
        return ExchangeBuilder.fanoutExchange("FanoutTestExchange")
                .autoDelete()
                .durable(false)
                .internal()
                .build();
    }

    @Bean
    Exchange headersExchange() {
        return ExchangeBuilder.headersExchange("HeadersExchange")
                .internal()
                .durable(true)
                .ignoreDeclarationExceptions()
                .build();
    }
}
