package com.example.esdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.esdemo")

public class EsdemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(EsdemoApplication.class, args);
    }
}
