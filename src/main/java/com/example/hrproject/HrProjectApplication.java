package com.example.hrproject;

import com.example.hrproject.Entities.Collaborateurs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HrProjectApplication {
    Collaborateurs collaborateurs ;
    public static void main(String[] args) {
        SpringApplication.run(HrProjectApplication.class, args);

    }
}
