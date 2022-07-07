package com.example.hrproject.Controllers;

import com.example.hrproject.Entities.Diplome;
import com.example.hrproject.Services.DiplomeService;
import com.example.hrproject.modals.CollabDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diplomes")
public class DiplomeController {

    private final DiplomeService diplomeService;

    @GetMapping
    public String welcome(){
        return "Bonjour !";
    }

    @Autowired
    public DiplomeController(DiplomeService diplomeService) {
        this.diplomeService = diplomeService;
    }

    @GetMapping("/getAll/{id}")
    public List<Diplome> getCollabs (@PathVariable("id") int matricule){
        return diplomeService.getDiplomes(matricule);
    }

}
