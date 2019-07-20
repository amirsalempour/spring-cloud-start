package com.amir.example.eurekaclient3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient3Application.class, args);
    }

}
