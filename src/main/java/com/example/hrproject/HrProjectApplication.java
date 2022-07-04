package com.example.hrproject;

import com.example.hrproject.Collaborateurs.Collaborateurs;
import com.example.hrproject.Collaborateurs.CollaborateursRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
@RestController
public class HrProjectApplication {
    Collaborateurs collaborateurs ;
    public static void main(String[] args) {
        SpringApplication.run(HrProjectApplication.class, args);

    }
}
