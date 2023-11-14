package com.example.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Tache {

    @Id
    @GeneratedValue
    private Long id;


    private Boolean terminee;




}
