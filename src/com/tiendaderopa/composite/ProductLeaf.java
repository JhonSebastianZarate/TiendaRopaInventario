package com.tiendaderopa.composite;

import com.tiendaderopa.core.ProductCore;

public class ProductLeaf extends InventoryComponent {
    private final ProductCore product;

    public ProductLeaf(ProductCore product) {
        this.product = product;
    }

    public ProductCore getProduct() {
        return product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public int getStock() {
        return product.getStock();
    }
}
