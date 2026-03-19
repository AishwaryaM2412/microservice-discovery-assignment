package com.example.productservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/product")
    public Map<String, String> getProduct() {
        return Map.of(
                "message", "Response from product-service",
                "port", port
        );
    }
}