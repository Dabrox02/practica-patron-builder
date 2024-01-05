package com.local;

public enum Categoria {

    TECNOLOGIA("Tech", "Destinado a tech"),
    DEPORTES("Sports", "Destinado a sports"),
    COMIDA("Food", "Destinado a Food");

    private String nombre;
    private String descripcion;

    private Categoria(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDescripcion(String descripcion) {
        this.nombre = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

}
