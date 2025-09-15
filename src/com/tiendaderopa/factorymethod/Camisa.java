package com.tiendaderopa.factorymethod;

// Producto concreto: Camisa
public class Camisa extends Product {
    @Override
    public String getName() {
        return "Camisa de algodon";
    }

    @Override
    public double getPrice() {
        return 25.0;
    }
}

