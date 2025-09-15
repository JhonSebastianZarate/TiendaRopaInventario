package com.tiendaderopa.abstractfactory;

public class RopaDeportivaFactory implements RopaFactory {
    @Override
    public ProductCamisa crearCamisa() {
        return () -> "Camisa deportiva de secado rapido";
    }

    @Override
    public ProductPantalon crearPantalon() {
        return () -> "Pantalon deportivo elastico";
    }
}
