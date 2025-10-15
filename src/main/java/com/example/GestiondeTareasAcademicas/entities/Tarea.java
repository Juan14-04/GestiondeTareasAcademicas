package com.example.GestiondeTareasAcademicas.entities;

public class Tarea {
    private Long id;
    private String titulo;
    private String descripcion;
    private String completada;

    public Tarea() {
    }

    public Tarea(Long id, String titulo, String descripcion, String completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCompletada() {
        return completada;
    }

    public void setCompletada(String completada) {
        this.completada = completada;
    }

    public void add(Tarea tarea) {
    }
}
