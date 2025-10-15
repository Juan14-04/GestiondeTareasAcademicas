package com.example.GestiondeTareasAcademicas.service;

import com.example.GestiondeTareasAcademicas.entities.Tarea;
import com.example.GestiondeTareasAcademicas.repository.TareaRepository;
import com.example.GestiondeTareasAcademicas.service.IMPL.ImTareaService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TareaService implements ImTareaService {
    @Override
    public List<Tarea> findALL() {
        return tareaRepository.findALL();
    }

    @Override
    public List<Tarea> findAll() {
        return List.of();
    }

    @Override
    public Optional<Tarea> findBYid(Long id) {
        return TareaRepository.findBYid(id);
    }

    @Override
    public Tarea crear(String titulo, String descripcion, String completada) {
        Tarea event = new Tarea();
        event.setTitulo(titulo);
        event.setDescripcion(descripcion);
        event.setCompletada(completada);
        return tareaRepository.guardar(event);
    }

    @Override
    public List<Tarea> finALL() {
        return List.of();
    }

    private TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository){
        this.tareaRepository= tareaRepository;
    }

}
