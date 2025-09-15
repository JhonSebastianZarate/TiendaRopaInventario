package com.tiendaderopa.singleton;

import java.util.ArrayList;
import java.util.List;

// Singleton para controlar un unico inventario
public class Inventario {
    private static Inventario instance;
    private List<String> productos;

    // Constructor privado
    private Inventario() {
        productos = new ArrayList<>();
    }

    // Metodo estatico que devuelve la unica instancia
    public static Inventario getInstance() {
        if (instance == null) {
            instance = new Inventario();
        }
        return instance;
    }

    // Metodos para manipular el inventario
    public void agregarProducto(String producto) {
        productos.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("=== Inventario Actual ===");
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío.");
        } else {
            for (String p : productos) {
                System.out.println("- " + p);
            }
        }
    }
}
