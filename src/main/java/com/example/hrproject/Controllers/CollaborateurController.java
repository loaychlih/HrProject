package com.example.hrproject.Controllers;

import com.example.hrproject.Entities.Collaborateur;
import com.example.hrproject.Services.CollaborateurService;
import com.example.hrproject.modals.CollabDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollaborateurController {

    private final CollaborateurService collaborateursService;

    @GetMapping
    public String welcome(){
        return "Bonjour !";
    }

    @Autowired
    public CollaborateurController(CollaborateurService collaborateursService) {
        this.collaborateursService = collaborateursService;
    }

    @GetMapping("/getAllCollabs")
    public List<Collaborateur> getCollabs (){
        return collaborateursService.getCollabs();
    }

    @PostMapping("/saveCollab")
    public String saveCollab (@RequestBody CollabDTO collabDTO){
        collaborateursService.saveCollab(collabDTO);
        return "Collab Saved !";
    }

}
