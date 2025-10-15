package com.example.GestiondeTareasAcademicas.service;

import com.example.GestiondeTareasAcademicas.entities.Estudiante;
import com.example.GestiondeTareasAcademicas.repository.EstudianteRepositoy;
import com.example.GestiondeTareasAcademicas.service.IMPL.ImEstidianteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements ImEstidianteService {
    @Override
    public List<Estudiante> findALL() {
        return EstudianteRepositoy.findALL();
    }

    @Override
    public Optional<Estudiante> findBYid(Long id) {
        return estudianteRepositoy.findBYid(id);
    }

    @Override
    public Estudiante crear(String nombre) {
        Estudiante estudiante = new Estudiante();
        estudiante.setName(nombre);
        return estudianteRepositoy.save(estudiante);
    }

    @Override
    public List<Estudiante> finALL() {
        return List.of();
    }

    private EstudianteRepositoy estudianteRepositoy;

    public EstudianteService(EstudianteRepositoy estudianteRepositoy){
        this.estudianteRepositoy= estudianteRepositoy;
    }
}
