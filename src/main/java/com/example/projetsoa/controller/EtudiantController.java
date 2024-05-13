package com.example.projetsoa.controller;

import com.example.projetsoa.dao.EtudiantRepository;
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


    // Endpoint pour créer un nouvel étudiant
    @PostMapping("/add")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {

        return etudiantService.addEtudiant(etudiant);
    }




}

