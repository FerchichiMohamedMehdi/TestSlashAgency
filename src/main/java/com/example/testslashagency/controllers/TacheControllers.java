package com.example.testslashagency.controllers;

import com.example.testslashagency.entities.Tache;
import com.example.testslashagency.services.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/Tache")
public class TacheControllers {



        @Autowired
        TacheService tacheService;
        @PostMapping("/add")
        public void addOrUpdateTache (@RequestBody Tache tache){
            tacheService.addOrUpdateTache(tache);
        }
        @DeleteMapping("/delete/{idTache}")
        public void deleteTache(@PathVariable("idTache")Long idTache){
            tacheService.deleteTache(idTache);
        }

        @GetMapping("/listAll")
        public List<Tache> listAllTache(){
            return tacheService.getAllTaches();
        }
}
