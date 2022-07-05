package com.example.hrproject.Entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
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
    private LocalDate embauche;
    private LocalDate BAP;
    private LocalDate depart;
    private boolean ancienCollab;
    private boolean seminaire;
    private LocalDate dateSeminaire;
    private String aPP;
    private  String poste;
    private double salaire;


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
