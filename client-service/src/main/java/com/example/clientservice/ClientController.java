package com.example.clientservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    private final RestTemplate restTemplate;

    public ClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/fetch")
    public String fetchProduct() {
        return restTemplate.getForObject("http://product-service/product", String.class);
    }
}