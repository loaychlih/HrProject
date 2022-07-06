package com.example.hrproject.Entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="Collaborateur")
@Data
public class Collaborateur {
    @Id
    @SequenceGenerator(
            name = "collaborateurs_sequence",
            sequenceName = "collaborateurs_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "collaborateurs_sequence"
    )


    private Long matricule;
    private String nom;
    private String prenom;
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    @Transient
    private String abrev;
    private String ancienRH;
    private String nouveauRH;
    private String site;
    private String BU;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate embauche;
    @Transient
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    private String BAP;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate depart;
    private boolean ancienCollab;
    private boolean seminaire;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateSeminaire;
    private String aPP;
    private  String poste;
    private double salaire;
    @OneToMany(mappedBy = "collaborateur",cascade = CascadeType.ALL)
    private Set<Competence> competences;
    @OneToMany(mappedBy = "collaborateur",cascade = CascadeType.ALL)
    private Set<Diplome> diplomes;

    public String getAbrev() {
        return  prenom.substring(0,1)+nom.substring(0,2);
    }
    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    @Override
    public String toString() {
        return "Collaborateurs{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", abrev='" + abrev + '\'' +
                ", ancienRH='" + ancienRH + '\'' +
                ", RhActuel='" + nouveauRH + '\'' +
                ", site='" + site + '\'' +
                ", BU='" + BU + '\'' +
                ", embauche=" + embauche +
                ", BAP=" + BAP +
                ", depart=" + depart +
                ", AncienCollab=" + ancienCollab +
                ", seminaire=" + seminaire +
                ", dateSeminaire=" + dateSeminaire +
                ", APP='" + aPP + '\'' +
                ", poste='" + poste + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
