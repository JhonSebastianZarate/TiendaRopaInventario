package com.tiendaderopa.command;

import com.tiendaderopa.core.ProductCore;

public class AddStockCommand implements InventoryCommand {
    private final ProductCore product;
    private final int qty;

    public AddStockCommand(ProductCore product, int qty) {
        if (qty <= 0) throw new IllegalArgumentException("La cantidad debe ser positiva");
        this.product = product; 
        this.qty = qty;
    }

    @Override 
    public void execute() { product.setStock(product.getStock() + qty); }

    @Override 
    public void undo() { product.setStock(product.getStock() - qty); }
}
