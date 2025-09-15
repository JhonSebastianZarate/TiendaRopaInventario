package com.tiendaderopa.factorymethod;

// Creador concreto para Pantalon
public class PantalonCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Pantalon();
    }
}
