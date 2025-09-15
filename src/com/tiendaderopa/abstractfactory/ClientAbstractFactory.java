package com.tiendaderopa.abstractfactory;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        // Usar fabrica de ropa deportiva
        RopaFactory deportiva = new RopaDeportivaFactory();
        System.out.println("Deportiva: " + deportiva.crearCamisa().getDescripcion());
        System.out.println("Deportiva: " + deportiva.crearPantalon().getDescripcion());

        // Usar fabrica de ropa formal
        RopaFactory formal = new RopaFormalFactory();
        System.out.println("Formal: " + formal.crearCamisa().getDescripcion());
        System.out.println("Formal: " + formal.crearPantalon().getDescripcion());
    }
}
