package com.example.projetsoa.controller;

import com.example.projetsoa.entity.Etudiant;
import com.example.projetsoa.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @PostMapping("/add")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantDetails(@PathVariable Long id) {
        return etudiantService.getUserDetailsById(id);
    }

    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@PathVariable Long id, @RequestBody Etudiant etudiantDetails) {
        Etudiant etudiant = etudiantService.getUserDetailsById(id);
        etudiant.setNom(etudiantDetails.getNom());
        etudiant.setPrenom(etudiantDetails.getPrenom());
        etudiant.setClasse(etudiantDetails.getClasse());
        return etudiantService.addEtudiant(etudiant); // Pour mettre à jour, nous utilisons la même méthode que pour l'ajout
    }

    @GetMapping("/all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.delete(id);
    }
}
