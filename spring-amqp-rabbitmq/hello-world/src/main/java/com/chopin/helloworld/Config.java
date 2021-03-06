package com.chopin.helloworld;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author chopin
 * @version 1.0
 * @description: TODO
 * @date 2021/12/26 17:38
 */
@Profile("welcome")
@Configuration
public class Config {

    @Bean
    public Queue welcome() {
        return new Queue("welcome");
    }

    @Profile("receiver")
    @Bean
    public Receiver receiver() {
        return new Receiver();
    }

    @Profile("sender")
    @Bean
    public Sender sender() {
        return new Sender();
    }
}