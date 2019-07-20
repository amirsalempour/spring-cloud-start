package com.amir.example.eurekaclient3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/controller")
public class TestController {
    @Autowired
    Testtt testtt;
    @GetMapping(path = "amir")
    public ResponseEntity getResponse(){
        testtt.serviceUrl();
        return ResponseEntity.ok("answer!!!!!!!");
    }
}
