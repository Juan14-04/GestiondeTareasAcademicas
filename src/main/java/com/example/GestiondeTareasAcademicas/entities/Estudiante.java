package com.example.GestiondeTareasAcademicas.entities;

public class Estudiante {
    private String name;
    private String id;

    public Estudiante() {
    }

    public Estudiante(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }



}

