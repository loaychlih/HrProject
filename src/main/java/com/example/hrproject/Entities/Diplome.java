package com.example.hrproject.Entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Diplome {
    @Id
    @SequenceGenerator(
            name = "diplomes_sequence",
            sequenceName = "diplomes_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "diplomes_sequence"
    )
    private String diplomeID;
    private String diplome;
    private String typeDiplome;
    private String ecole;
    private String typeEcole;
    private int promotion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="matricule", nullable = false)
    private Collaborateur collaborateur;

}
