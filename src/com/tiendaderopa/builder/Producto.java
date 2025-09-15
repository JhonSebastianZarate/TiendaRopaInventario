package com.tiendaderopa.builder;

public class Producto {
    private String nombre;
    private String talla;
    private String color;
    private String material;
    private double precio;

    // Constructor privado (solo se puede crear con el builder)
    private Producto(ProductoBuilder builder) {
        this.nombre = builder.nombre;
        this.talla = builder.talla;
        this.color = builder.color;
        this.material = builder.material;
        this.precio = builder.precio;
    }

    @Override
    public String toString() {
        return nombre + " [Talla: " + talla + ", Color: " + color + ", Material: " + material + ", Precio: $" + precio + "]";
    }

    // Clase Builder interna
    public static class ProductoBuilder {
        private String nombre;
        private String talla;
        private String color;
        private String material;
        private double precio;

        public ProductoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public ProductoBuilder setTalla(String talla) {
            this.talla = talla;
            return this;
        }

        public ProductoBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ProductoBuilder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public ProductoBuilder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public Producto build() {
            return new Producto(this);
        }
    }
}
