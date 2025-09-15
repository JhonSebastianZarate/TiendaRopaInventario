package com.tiendaderopa.factorymethod;

// Cliente que prueba el patron Factory Method
public class Client {
    public static void main(String[] args) {
        // Crear una camisa
        Creator camisaCreator = new CamisaCreator();
        Product camisa = camisaCreator.createProduct();
        System.out.println("Producto: " + camisa.getName() + " - Precio: $" + camisa.getPrice());

        // Crear un pantalon
        Creator pantalonCreator = new PantalonCreator();
        Product pantalon = pantalonCreator.createProduct();
        System.out.println("Producto: " + pantalon.getName() + " - Precio: $" + pantalon.getPrice());
    }
}
