package com.example.hrproject.Collaborateurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
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
