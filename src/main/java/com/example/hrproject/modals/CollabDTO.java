package com.example.hrproject.modals;

import com.example.hrproject.Entities.Collaborateur;
import com.example.hrproject.Entities.Competence;
import com.example.hrproject.Entities.Diplome;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CollabDTO {
    private Collaborateur collab;
    private List<Competence> competences;
    private List<Diplome> diplomes;

}
