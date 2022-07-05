package com.example.hrproject.Entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table
@Data

public class Collaborateurs {
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
    @Transient
    private String abrev;
    private String ancienRH;
    private String RhActuel;
    private String site;
    private  String BU;
    private LocalDate embauche;
    private LocalDate BAP;
    private LocalDate depart;
    private boolean AncienCollab;
    private boolean seminaire;
    private LocalDate dateSeminaire;
    private String APP;
    private  String poste;
    private double salaire;

    public Collaborateurs(Long matricule,
                          String nom,
                          String prenom,
                          String ancienRH,
                          String RhActuel,
                          String site,
                          String BU,
                          LocalDate embauche,
                          LocalDate BAP,
                          LocalDate depart,
                          boolean ancienCollab,
                          boolean seminaire,
                          LocalDate dateSeminaire,
                          String APP,
                          String poste,
                          double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.ancienRH = ancienRH;
        this.site = site;
        this.BU = BU;
        this.embauche = embauche;
        this.BAP = BAP;
        this.depart = depart;
        AncienCollab = ancienCollab;
        this.seminaire = seminaire;
        this.dateSeminaire = dateSeminaire;
        this.APP = APP;
        this.poste = poste;
        this.salaire = salaire;
    }

    public Collaborateurs(String nom,
                          String prenom,
                          String ancienRH,
                          String RhActuel,
                          String site,
                          String BU,
                          LocalDate embauche,
                          LocalDate BAP,
                          LocalDate depart,
                          boolean ancienCollab,
                          boolean seminaire,
                          LocalDate dateSeminaire,
                          String APP,
                          String poste,
                          double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.ancienRH = ancienRH;
        this.site = site;
        this.BU = BU;
        this.embauche = embauche;
        this.BAP = BAP;
        this.depart = depart;
        AncienCollab = ancienCollab;
        this.seminaire = seminaire;
        this.dateSeminaire = dateSeminaire;
        this.APP = APP;
        this.poste = poste;
        this.salaire = salaire;
    }

    public Collaborateurs() {
    }

    public String getRhActuel() {
        return RhActuel;
    }

    public void setRhActuel(String rhActuel) {
        RhActuel = rhActuel;
    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAbrev() {
        return  prenom.substring(0,1)+nom.substring(0,2);
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public String getAncienRH() {
        return ancienRH;
    }

    public void setAncienRH(String ancienRH) {
        this.ancienRH = ancienRH;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getBU() {
        return BU;
    }

    public void setBU(String BU) {
        this.BU = BU;
    }

    public LocalDate getEmbauche() {
        return embauche;
    }

    public void setEmbauche(LocalDate embauche) {
        this.embauche = embauche;
    }

    public LocalDate getBAP() {
        return BAP;
    }

    public void setBAP(LocalDate BAP) {
        this.BAP = BAP;
    }

    public LocalDate getDepart() {
        return depart;
    }

    public void setDepart(LocalDate depart) {
        this.depart = depart;
    }

    public boolean isAncienCollab() {
        return AncienCollab;
    }

    public void setAncienCollab(boolean ancienCollab) {
        AncienCollab = ancienCollab;
    }

    public boolean isSeminaire() {
        return seminaire;
    }

    public void setSeminaire(boolean seminaire) {
        this.seminaire = seminaire;
    }

    public LocalDate getDateSeminaire() {
        return dateSeminaire;
    }

    public void setDateSeminaire(LocalDate dateSeminaire) {
        this.dateSeminaire = dateSeminaire;
    }

    public String getAPP() {
        return APP;
    }

    public void setAPP(String APP) {
        this.APP = APP;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    @Override
    public String toString() {
        return "Collaborateurs{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", abrev='" + abrev + '\'' +
                ", ancienRH='" + ancienRH + '\'' +
                ", RhActuel='" + RhActuel + '\'' +
                ", site='" + site + '\'' +
                ", BU='" + BU + '\'' +
                ", embauche=" + embauche +
                ", BAP=" + BAP +
                ", depart=" + depart +
                ", AncienCollab=" + AncienCollab +
                ", seminaire=" + seminaire +
                ", dateSeminaire=" + dateSeminaire +
                ", APP='" + APP + '\'' +
                ", poste='" + poste + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
