package com.leroymerlin.produitapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;

/*
Pour la question 4 (validation) j'ai essayer de faire les deux dernier import pour
ne pas avoir un nombre negatif mais je n'arrive pas a trouver la library pour faire l'import
*/


/**
 * Représente un produit dans l'application.
 */
@Entity
public class Produit {

    /**
     * L'identifiant unique du produit. Il est généré automatiquement.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank(message = "Le nom du produit ne peut pas être vide")
    private String nom;

    /**
     * Le prix du produit. Doit être un nombre non négatif.
     */
    //@Min(value = 0, message = "Le prix ne peut pas être négatif")
    private double prix;


    //getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
