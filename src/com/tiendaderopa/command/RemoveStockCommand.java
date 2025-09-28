package com.tiendaderopa.command;

import com.tiendaderopa.core.ProductCore;

public class RemoveStockCommand implements InventoryCommand {
    private final ProductCore product;
    private final int qty;

    public RemoveStockCommand(ProductCore product, int qty) {
        if (qty <= 0) throw new IllegalArgumentException("La cantidad debe ser positiva");
        this.product = product; 
        this.qty = qty;
    }

    @Override 
    public void execute() {
        int result = product.getStock() - qty;
        if (result < 0) throw new IllegalStateException("No se permite stock negativo");
        product.setStock(result);
    }

    @Override 
    public void undo() { product.setStock(product.getStock() + qty); }
}
