package com.example.GestiondeTareasAcademicas.controller;

import com.example.GestiondeTareasAcademicas.entities.Estudiante;
import com.example.GestiondeTareasAcademicas.service.IMPL.ImEstidianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api")
@RestController
public class EstudianteController {    private ImEstidianteService imEstidianteService;
    @PostMapping("/crear")
    public Estudiante crear(@RequestParam String nombre){
        return imEstidianteService.crear(nombre);
    }
    public EstudianteController(ImEstidianteService iStudentService){
        this.imEstidianteService = imEstidianteService;
    }

    @GetMapping("/{id}")
    public Optional<Estudiante> obtenerporid(@PathVariable Long id){
        return imEstidianteService.findBYid(id);
    }
    @GetMapping("/todos")
    public List<Estudiante> obtenertodo(){
        return imEstidianteService.finALL();
    }


}
