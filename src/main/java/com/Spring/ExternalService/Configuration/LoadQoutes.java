package com.Spring.ExternalService.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadQoutes {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
