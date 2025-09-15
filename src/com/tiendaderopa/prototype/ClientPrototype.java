package com.tiendaderopa.prototype;

public class ClientPrototype {
    public static void main(String[] args) {
        // Crear producto original
        Camisa camisaOriginal = new Camisa("Camisa deportiva", 30.0);
        System.out.println("Original: " + camisaOriginal);

        // Clonar producto
        Camisa camisaClonada = (Camisa) camisaOriginal.clone();
        System.out.println("Clonada: " + camisaClonada);

        // Crear otro producto
        Pantalon pantalonOriginal = new Pantalon("Pantalon clasico", 50.0);
        System.out.println("Original: " + pantalonOriginal);

        // Clonar producto
        Pantalon pantalonClonado = (Pantalon) pantalonOriginal.clone();
        System.out.println("Clonada: " + pantalonClonado);
    }
}
