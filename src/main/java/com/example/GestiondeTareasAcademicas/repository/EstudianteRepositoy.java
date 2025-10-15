package com.example.GestiondeTareasAcademicas.repository;

import com.example.GestiondeTareasAcademicas.entities.Estudiante;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class EstudianteRepositoy {
    private final List<Estudiante> estudiantes = new ArrayList<>();

    public static List<Estudiante> findALL() {
        return null;
    }

    public Estudiante save(Estudiante estudiante) {
        estudiantes.add(estudiante);
        return estudiante;
    }

    public List<Estudiante> findAll() {
        return estudiantes;
    }

    public Optional<Estudiante> findById(String id) {
        return estudiantes.stream()
                .filter(student -> student.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    public boolean deleteById(String id) {
        return estudiantes.removeIf(student -> student.getId().equalsIgnoreCase(id));
    }

    public Optional<Estudiante> findBYid(Long id) {
    }
}