package com.example.hrproject.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table
public class Diplome {
    @Id
    @GeneratedValue
    private String diplomeID;
    private String diplome;
    private String typeDiplome;
    private String ecole;
    private String typeEcole;
    private int promotion;

    @ManyToOne
    @JoinColumn(name="matricule", nullable = false)
    private Collaborateur collaborateurs;

}
