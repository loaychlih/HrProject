package com.example.hrproject.Services;

import com.example.hrproject.Entities.Collaborateur;
import com.example.hrproject.Entities.Competence;
import com.example.hrproject.Entities.Diplome;
import com.example.hrproject.Repositories.CollaborateurRepository;
import com.example.hrproject.Repositories.CompetenceRepository;
import com.example.hrproject.Repositories.DiplomeRepository;
import com.example.hrproject.modals.CollabDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenceService {

    private final CompetenceRepository competenceRepository;

    public List<Competence> getComptences(int matricule) {
        return competenceRepository.findAllByCollaborateur_Matricule(matricule);
    }
    @Autowired
    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

}

