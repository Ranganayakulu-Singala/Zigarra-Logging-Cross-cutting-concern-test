package com.company.zigatta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.company.zigatta.service.DBServiceA;
import com.company.zigatta.service.HttpServiceB;
 
 
@SpringBootApplication
public class Application {

    
    @Autowired
    private DBServiceA dbServiceA;
    
    @Autowired
    private HttpServiceB httpServiceB;
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
 
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            dbServiceA.getData(1);
            httpServiceB.sendMessage("Message");
 
        };
    }
}