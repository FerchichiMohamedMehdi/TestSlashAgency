package com.example.controllers;

import com.example.entities.Tache;
import com.example.services.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
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
        @CrossOrigin(origins = "*")
        @GetMapping("/listAll")
        public List<Tache> listAllTache(){
            return tacheService.getAllTaches();
        }
}
