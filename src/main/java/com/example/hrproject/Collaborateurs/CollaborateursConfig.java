package com.example.hrproject.Collaborateurs;

import com.example.hrproject.Entities.Collaborateur;
import com.example.hrproject.Repositories.CollaborateursRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class CollaborateursConfig {

    @Bean
    CommandLineRunner commandLineRunner(CollaborateursRepository repository){
        Scanner sc=new Scanner(System.in);

        System.out.print("\n \nPlease input name");
        String name =sc.nextLine();
        System.out.print("\n \nPlease input lastname");
        String lastname =sc.nextLine();
        return args -> {
 /* Collaborateur first = new Collaborateur(

          name,
          lastname,
          null,
          null,
          null,
          null,
          null,
          null,
          null,
          false,
          false,
          null,
          null,
          null,
          0
            );
            repository.save(first);*/
        };

    }

}
