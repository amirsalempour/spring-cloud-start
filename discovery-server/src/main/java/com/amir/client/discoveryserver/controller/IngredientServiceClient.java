package com.amir.client.discoveryserver.controller;

import com.amir.client.discoveryserver.model.Ingredient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
public class IngredientServiceClient {

    private RestTemplate rest;

    public IngredientServiceClient(@LoadBalanced RestTemplate rest) {
        this.rest = rest;
    }

    public Ingredient getById(Long id){
        return rest.getForObject("http://ingredient-service/ingredients/{id}",Ingredient.class,id);
    }
}
