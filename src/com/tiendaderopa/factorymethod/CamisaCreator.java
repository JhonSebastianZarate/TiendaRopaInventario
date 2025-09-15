package com.tiendaderopa.factorymethod;

// Creador concreto para Camisa
public class CamisaCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Camisa();
    }
}
