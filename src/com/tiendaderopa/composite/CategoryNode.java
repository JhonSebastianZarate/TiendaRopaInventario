package com.tiendaderopa.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CategoryNode extends InventoryComponent {
    private final String name;
    private final String description;
    private final List<String> attributesSchema;
    private final List<InventoryComponent> children = new ArrayList<>();

    // Constructor largo (nombre, descripcion, schema)
    public CategoryNode(String name, String description, List<String> attributesSchema) {
        this.name = name;
        this.description = description;
        this.attributesSchema = attributesSchema;
    }

    // Constructor corto (solo nombre) — el que usa tu DemoEntrega2
    public CategoryNode(String name) {
        this(name, "", new ArrayList<String>());
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getAttributesSchema() {
        return Collections.unmodifiableList(attributesSchema);
    }

    @Override
    public int getStock() {
        int total = 0;
        for (InventoryComponent child : children) {
            total += child.getStock();
        }
        return total;
    }

    @Override
    public List<InventoryComponent> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public void add(InventoryComponent c) {
        children.add(c);
    }

    @Override
    public void remove(InventoryComponent c) {
        children.remove(c);
    }
}
