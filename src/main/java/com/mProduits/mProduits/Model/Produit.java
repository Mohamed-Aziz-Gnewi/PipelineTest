package com.mProduits.mProduits.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    private String titre;

    private String description;

    private String image;

    private Double prix;

    @OneToMany
    private List<Commande> commandes;

    //Contructors

    public Produit() {
    }

    public Produit(String titre, String description, String image, Double prix) {
        this.titre = titre;
        this.description = description;
        this.image = image;
        this.prix = prix;
    }

    public Produit(Long id, String titre, String description, String image, Double prix) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.image = image;
        this.prix = prix;
    }
    //Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
