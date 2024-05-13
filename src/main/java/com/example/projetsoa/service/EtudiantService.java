package com.example.projetsoa.service;

import com.example.projetsoa.dao.EtudiantRepository;
import com.example.projetsoa.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public Etudiant getUserDetailsById(Long id) {

        return etudiantRepository.getById(id);
    }
    public void delete(Long id) {etudiantRepository.deleteById(id);
    }
    public Etudiant addEtudiant(Etudiant etudiant) {


        return etudiantRepository.save(etudiant);
    }
}
