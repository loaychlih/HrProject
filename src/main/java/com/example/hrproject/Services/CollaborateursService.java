package com.example.hrproject.Services;

import com.example.hrproject.Entities.Collaborateurs;
import com.example.hrproject.Repositories.CollaborateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CollaborateursService {
    private final CollaborateursRepository collaborateursRepository;
@Autowired
    public CollaborateursService(CollaborateursRepository collaborateursRepository) {
        this.collaborateursRepository = collaborateursRepository;
    }

    public List<Collaborateurs> getCollabs() {
        return collaborateursRepository.findAll();
    }
}
