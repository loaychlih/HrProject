package com.example.hrproject.Controllers;

import com.example.hrproject.Entities.Collaborateurs;
import com.example.hrproject.Services.CollaborateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CollaborateursController {

    private final CollaborateursService collaborateursService;

    @Autowired
    public CollaborateursController(CollaborateursService collaborateursService) {
        this.collaborateursService = collaborateursService;
    }

    @GetMapping
    public List<Collaborateurs> getCollabs (){
        return collaborateursService.getCollabs();
    }
}
