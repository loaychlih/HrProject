package com.example.hrproject.Entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Collaborateur")
@Getter
@Setter
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


    private int matricule;
    private String nom;
    private String prenom;
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    @Transient
    private String abrev ="Sdq";
    private String ancienRH;
    private String nouveauRH;
    private String site;
    private String bu;
    private LocalDate embauche;
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    @Transient
    private int bap = 5;
    private LocalDate depart;
    private boolean ancienCollab;
    private boolean seminaire;
    private LocalDate dateSeminaire;
    private String app;
    private  String poste;
    private double salaire;
    @OneToMany(mappedBy = "collaborateur",cascade = CascadeType.ALL)
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    private Set<Competence> competences = new HashSet<>();
    @OneToMany(mappedBy = "collaborateur",cascade = CascadeType.ALL)
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    private Set<Diplome> diplomes = new HashSet<>();

    public int getBap() {
        return embauche.getDayOfMonth()>= 15 ? embauche.getMonthValue()+1 :embauche.getMonthValue() ;
    }

    public void setBap(int bap) {
        this.bap = bap;
    }
    public void addCompetences(List<Competence> competences1){
        for(Competence com : competences1) {
            com.setCollaborateur(this);
            competences.add(com);
        }
    }
    public void removeCompetence(List<Competence> competences1){
        for(Competence com : competences1) {
            com.setCollaborateur(null);
            competences.remove(com);
        }
    }
    public void addDiplomes(List<Diplome> diplomes1){
        System.out.println(diplomes1.size());
        for(Diplome dip : diplomes1){
            dip.setCollaborateur(this);
            diplomes.add(dip);
        }
    }
    public void removeDiplome(List<Diplome> diplomes1){
        for(Diplome dip : diplomes1) {
            dip.setCollaborateur(null);
            diplomes.remove(dip);
        }
    }
    public String getAbrev() {
        return prenom.charAt(0)+nom.substring(0,2);
    }
    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }
}
