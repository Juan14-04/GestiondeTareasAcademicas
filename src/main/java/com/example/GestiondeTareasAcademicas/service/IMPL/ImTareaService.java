package com.example.GestiondeTareasAcademicas.service.IMPL;

import com.example.GestiondeTareasAcademicas.entities.Tarea;

import java.awt.*;
import java.util.*;
import java.util.List;

public interface ImTareaService {
    List<Tarea> findALL();

    List<Tarea> findAll();
    Optional<Tarea> findBYid(Long id);
    Tarea crear (String titulo, String descripcion, String completada);
}
