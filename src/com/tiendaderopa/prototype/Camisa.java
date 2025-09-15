package com.tiendaderopa.prototype;

public class Camisa extends Ropa {

    public Camisa(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public Prototype clone() {
        return new Camisa(this.getNombre(), this.getPrecio());
    }
}
