package com.tiendaderopa.abstractfactory;

public class RopaFormalFactory implements RopaFactory {
    @Override
    public ProductCamisa crearCamisa() {
        return () -> "Camisa formal blanca";
    }

    @Override
    public ProductPantalon crearPantalon() {
        return () -> "Pantalon formal negro";
    }
}
