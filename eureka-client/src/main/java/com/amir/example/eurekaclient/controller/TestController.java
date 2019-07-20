package com.amir.example.eurekaclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/controller")
public class TestController {
    @GetMapping(path = "amir")
    public ResponseEntity getResponse(){
        return ResponseEntity.ok("answer!!!!!!!");
    }
}
