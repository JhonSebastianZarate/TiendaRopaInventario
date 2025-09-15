package com.tiendaderopa.builder;

public class ClientBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        // Crear productos predefinidos
        Producto camisa = director.construirCamisaBasica();
        Producto pantalon = director.construirPantalonPremium();

        System.out.println("Producto creado con Director: " + camisa);
        System.out.println("Producto creado con Director: " + pantalon);

        // Crear producto personalizado con el Builder directamente
        Producto zapato = new Producto.ProductoBuilder()
                .setNombre("Zapato deportivo")
                .setTalla("42")
                .setColor("Rojo")
                .setMaterial("Cuero sintetico")
                .setPrecio(80.0)
                .build();

        System.out.println("Producto creado manualmente: " + zapato);
    }
}
