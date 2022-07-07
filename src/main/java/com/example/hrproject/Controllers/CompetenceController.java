package com.example.hrproject.Controllers;

import com.example.hrproject.Entities.Collaborateur;
import com.example.hrproject.Entities.Competence;
import com.example.hrproject.Services.CollaborateurService;
import com.example.hrproject.Services.CompetenceService;
import com.example.hrproject.modals.CollabDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/competences")
public class CompetenceController {

    private final CompetenceService comptenceService;

    @Autowired
    public CompetenceController(CompetenceService comptenceService) {
        this.comptenceService = comptenceService;
    }

    @GetMapping("/getAll/{id}")
    public List<Competence> getCollabs (@PathVariable("id") int matricule){
        return comptenceService.getComptences(matricule);
    }

}
