package com.example.testslashagency.services;

import com.example.testslashagency.entities.Tache;
import com.example.testslashagency.repositories.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TacheService {

    @Autowired
    TacheRepository tacheRepository;

    public void addOrUpdateTache(Tache tache){
        tacheRepository.save(tache);
    }


    public void deleteTache(Long id){
        tacheRepository.deleteById(id);
    }

    public List <Tache> getAllTaches(){
        List<Tache> listTaches = new ArrayList<>();
        listTaches=tacheRepository.findAll();
        return listTaches ;
    }
}
