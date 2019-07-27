package com.example.clientsample.client.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RecommendationController {
    private final RestTemplate restTemplate;

    public RecommendationController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(path = "/reccomendation")
    public ResponseEntity gettestClient() {
        return ResponseEntity.ok().body(restTemplate.getForObject("http://testservice/controller/amir", String.class));
    }
}
