package com.example.GestiondeTareasAcademicas.service.IMPL;

import com.example.GestiondeTareasAcademicas.entities.Estudiante;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ImEstidianteService {
    List<Estudiante> findALL();
    Optional<Estudiante> findBYid(Long id);
    Estudiante crear(String nombre);
}


