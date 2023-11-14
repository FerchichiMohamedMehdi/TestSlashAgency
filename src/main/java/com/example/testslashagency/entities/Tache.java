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
    private String name;
    private Boolean terminee;




}
