package com.tiendaderopa.composite;

import java.util.Collections;
import java.util.List;

public abstract class InventoryComponent {
    public abstract String getName();

    public int getStock() {
        return 0;
    }

    public List<InventoryComponent> getChildren() {
        return Collections.emptyList();
    }

    // 🔹 Agrega estas dos firmas para que CategoryNode pueda @Override
    public void add(InventoryComponent c) { }

    public void remove(InventoryComponent c) { }
}
