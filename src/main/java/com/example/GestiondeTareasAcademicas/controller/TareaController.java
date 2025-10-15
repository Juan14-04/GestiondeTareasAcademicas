package com.example.GestiondeTareasAcademicas.controller;


import com.example.GestiondeTareasAcademicas.entities.Tarea;
import com.example.GestiondeTareasAcademicas.service.IMPL.ImTareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api")
@RestController
public class TareaController {    private ImTareaService imTareaService;
    @PostMapping("/crear")
    public Tarea crear(@RequestParam String titulo,@RequestParam String descripcion,@RequestParam String completada){
        return imTareaService.crear(titulo, descripcion, completada);
    }
    public void EstudianteController(ImTareaService imTareaService){

        this.imTareaService = imTareaService;
    }

    @GetMapping("/{id}")
    public Optional<Tarea> obtenerporid(@PathVariable Long id){
        return imTareaService.findBYid(id);
    }
    @GetMapping("/todos")
    public List<Tarea> obtenertodo(){
        return imTareaService.finALL();
    }

}
