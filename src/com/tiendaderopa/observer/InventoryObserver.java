package com.tiendaderopa.observer;

import com.tiendaderopa.core.ProductCore;

public interface InventoryObserver {
    void onStockChanged(ProductCore product, int oldValue, int newValue);
}
