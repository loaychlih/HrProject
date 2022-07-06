package com.example.hrproject.Services;

import com.example.hrproject.Entities.Collaborateur;
import com.example.hrproject.Repositories.CollaborateursRepository;
import com.example.hrproject.Repositories.CompetenceRepository;
import com.example.hrproject.Repositories.DiplomeRepository;
import com.example.hrproject.modals.CollabDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaborateursService {
    private final CollaborateursRepository collaborateursRepository;
    private final DiplomeRepository diplomeRepository;
    private final CompetenceRepository competenceRepository;
    @Autowired



    public List<Collaborateur> getCollabs() {
        return collaborateursRepository.findAll();
    }

    public CollaborateursService(CollaborateursRepository collaborateursRepository, DiplomeRepository diplomeRepository, CompetenceRepository competenceRepository) {
        this.collaborateursRepository = collaborateursRepository;
        this.diplomeRepository = diplomeRepository;
        this.competenceRepository = competenceRepository;
    }

    public void saveCollab(CollabDTO newest){
        Collaborateur collab = newest.getCollab();
//        collab.setDiplomes(newest.getDiplomes());
//        collab.setCompetences(newest.getCompetences());



//        collaborateursRepository.save(newest);
    }
}

