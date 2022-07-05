package com.example.hrproject.Services;

import com.example.hrproject.Entities.Collaborateur;
import com.example.hrproject.Repositories.CollaborateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class CollaborateursService {
    private final CollaborateursRepository collaborateursRepository;
@Autowired
    public CollaborateursService(CollaborateursRepository collaborateursRepository) {
        this.collaborateursRepository = collaborateursRepository;
    }

    public List<Collaborateur> getCollabs() {
        return collaborateursRepository.findAll();
    }

    public void  saveCollab(Collaborateur newest){
        CollaborateursRepository repository = null;
        repository.save(newest);

        return;
    }
}

