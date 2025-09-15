package com.tiendaderopa.builder;

public class Director {

    public Producto construirCamisaBasica() {
        return new Producto.ProductoBuilder()
                .setNombre("Camisa basica")
                .setTalla("M")
                .setColor("Blanco")
                .setMaterial("Algodon")
                .setPrecio(20.0)
                .build();
    }

    public Producto construirPantalonPremium() {
        return new Producto.ProductoBuilder()
                .setNombre("Pantalon premium")
                .setTalla("32")
                .setColor("Negro")
                .setMaterial("Mezclilla")
                .setPrecio(60.0)
                .build();
    }
}
