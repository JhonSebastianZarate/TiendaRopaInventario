package com.tiendaderopa.prototype;

public class Pantalon extends Ropa {

    public Pantalon(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public Prototype clone() {
        return new Pantalon(this.getNombre(), this.getPrecio());
    }
}
