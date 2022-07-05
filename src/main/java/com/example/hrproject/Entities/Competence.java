package com.example.hrproject.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Table
@Entity


public class Competence {
    @Id
    @SequenceGenerator(
            name = "competence_sequence",
            sequenceName = "competence_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "competence_sequence"
    )


    private long competenceId;
    private String name;
    private int note;
    @ManyToMany
    private Set<Collaborateur> collaborateurs;
}
