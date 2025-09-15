package com.tiendaderopa.factorymethod;

// Producto concreto: Pantalon
public class Pantalon extends Product {
    @Override
    public String getName() {
        return "Pantalon de mezclilla";
    }

    @Override
    public double getPrice() {
        return 40.0;
    }
}

