package com.tiendaderopa.core;

import java.util.*;
import com.tiendaderopa.observer.InventoryObserver;

public class ProductCore implements Cloneable {
    private final String id;
    private String name;
    private double price;
    private int stock;
    private Map<String, Object> attributes = new HashMap<>();
    private final List<InventoryObserver> observers = new ArrayList<>();

    public ProductCore(String name, double price, int stock) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Manejo de observadores
    public void addObserver(InventoryObserver o) { observers.add(o); }
    public void removeObserver(InventoryObserver o) { observers.remove(o); }
    private void notifyObservers(int oldV, int newV) {
        for (InventoryObserver o : observers) {
        o.onStockChanged(this, oldV, newV);
    }
}

    // Stock con notificación
    public void setStock(int newStock) {
        int old = this.stock;
        this.stock = newStock;
        notifyObservers(old, newStock);
    }

    // Atributos
    public void putAttr(String key, Object value) { attributes.put(key, value); }
    public Object getAttr(String key) { return attributes.get(key); }

    // Getters y setters básicos
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public ProductCore clone() {
        try {
            ProductCore c = (ProductCore) super.clone();
            c.attributes = new HashMap<>(this.attributes);
            return c;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override 
    public String toString() {
        return name + " ($" + price + ", stock " + stock + ")";
    }
}

