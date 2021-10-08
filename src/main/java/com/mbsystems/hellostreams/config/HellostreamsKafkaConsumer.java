package com.mbsystems.hellostreams.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class HellostreamsKafkaConsumer {

    @Bean
    public Consumer<KStream<String, String>> process() {
        return input -> input.foreach((k, v) -> log.info(String.format("Key: %s, Value: %s", k, v)));
    }
}
