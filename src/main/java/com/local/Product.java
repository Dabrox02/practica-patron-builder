package com.local;

public class Product {

    private String nombre;
    private String serial;
    private String nroLote;
    private String fechaVencimiento;
    private Categoria categoria;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNroLote() {
        return this.nroLote;
    }

    public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
    }

    public String getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", serial='" + getSerial() + "'" +
                ", nroLote='" + getNroLote() + "'" +
                ", fechaVencimiento='" + getFechaVencimiento() + "'" +
                ", categoria='" + getCategoria() + "'" +
                "}";
    }

}
