package com.tiendaderopa.singleton;

public class ClientSingleton {
    public static void main(String[] args) {
        Inventario inventario1 = Inventario.getInstance();
        Inventario inventario2 = Inventario.getInstance();

        // Agregar productos desde inventario1
        inventario1.agregarProducto("Camisa deportiva");
        inventario1.agregarProducto("Pantalon clasico");

        // Mostrar inventario desde inventario2 (misma instancia)
        inventario2.mostrarInventario();

        // Confirmar que es el mismo objeto
        System.out.println("Es el mismo inventario? " + (inventario1 == inventario2));
    }
}
