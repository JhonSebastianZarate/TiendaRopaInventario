package com.tiendaderopa.observer;

import com.tiendaderopa.core.ProductCore;

public class LowStockObserver implements InventoryObserver {
    private final int threshold;
    public LowStockObserver(int threshold) { this.threshold = threshold; }

    @Override
    public void onStockChanged(ProductCore p, int oldV, int newV) {
        if (newV <= threshold) {
            System.out.println("[ALERTA] Stock bajo de " + p.getName() + ": " + newV);
        }
    }
}
