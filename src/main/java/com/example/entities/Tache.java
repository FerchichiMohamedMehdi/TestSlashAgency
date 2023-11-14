package com.example.entities;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tache {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Boolean terminee;




}
