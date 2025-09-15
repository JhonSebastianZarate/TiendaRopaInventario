package com.tiendaderopa.prototype;

public abstract class Ropa implements Prototype {
    private String nombre;
    private double precio;

    public Ropa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public abstract Prototype clone();

    @Override
    public String toString() {
        return nombre + " - Precio: $" + precio;
    }
}
