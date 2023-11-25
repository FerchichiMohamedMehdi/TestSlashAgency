package com.example.testslashagency.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tache {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private Etat etat;

    public Tache(String nom, Etat etat) {
        this.nom = nom;
        this.etat = etat;
    }
}