package com.Spring.ExternalService.Controller;

import com.Spring.ExternalService.Model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuoteController {

    private final RestTemplate restTemplate;

    @Autowired
    public QuoteController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/quote")
    Quote get() {
        return restTemplate.getForObject(
                "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    }
}
