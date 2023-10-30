package com.david.spring.javaBasedConfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloDavidConfig {

    @Bean
    public HelloDavid helloDavid() {
        return new HelloDavid();
    }
}
