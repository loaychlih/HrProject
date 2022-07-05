package com.example.hrproject;

import com.example.hrproject.Entities.Collaborateur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HrProjectApplication {
    Collaborateur collaborateurs ;
    public static void main(String[] args) {
        SpringApplication.run(HrProjectApplication.class, args);

    }
}
