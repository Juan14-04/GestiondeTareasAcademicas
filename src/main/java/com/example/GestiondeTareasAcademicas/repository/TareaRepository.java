package com.example.GestiondeTareasAcademicas.repository;

import com.example.GestiondeTareasAcademicas.entities.Tarea;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TareaRepository {
    private static List<Tarea> Listatarea = new ArrayList<>();
    long idsiguiente = 0;

    public Tarea guardar(Tarea tarea) {
        if (tarea.getId() == null) {
            idsiguiente++;
            tarea.setId(idsiguiente);
            Listatarea.add(tarea);
            return tarea;
        } else {
            System.out.println("Error de Compilacion");
        }
        return tarea;
    }

    public List<Tarea> findALL() {
        return Listatarea;
    }

    public static Optional<Tarea> findBYid(Long id) {
        return Listatarea.stream().filter(tarea -> tarea.getId().equals(id)).findFirst();
    }

}
