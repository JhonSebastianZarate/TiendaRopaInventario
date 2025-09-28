package com.tiendaderopa.app;

import com.tiendaderopa.core.ProductCore;
import com.tiendaderopa.observer.LowStockObserver;
import com.tiendaderopa.command.*;
import com.tiendaderopa.composite.*;

public class DemoEntrega2 {
    public static void main(String[] args) {
        // Categoria principal
        CategoryNode ropa = new CategoryNode("Ropa");

        // Crear producto
        ProductCore camisa = new ProductCore("Camisa basica", 59900, 3);
        camisa.addObserver(new LowStockObserver(2));
        ropa.add(new ProductLeaf(camisa));

        // Invoker para comandos
        InventoryInvoker invoker = new InventoryInvoker();

        System.out.println("== Inventario inicial ==");
        printTree(ropa, 0);

        // Vender 1 unidad
        System.out.println("\n-- Venta de 1 unidad --");
        invoker.apply(new RemoveStockCommand(camisa, 1));
        printTree(ropa, 0);

        // Vender otra unidad
        System.out.println("\n-- Venta de 1 unidad --");
        invoker.apply(new RemoveStockCommand(camisa, 1));
        printTree(ropa, 0);

        // Reponer stock
        System.out.println("\n-- Reposicion +3 --");
        invoker.apply(new AddStockCommand(camisa, 3));
        printTree(ropa, 0);

        // Deshacer ultima operacion
        System.out.println("\n-- Undo (deshacer ultima) --");
        invoker.undo();
        printTree(ropa, 0);

        // Probar clon
        System.out.println("\n== Tras clonar ==");
        ProductCore clon = camisa.clone();
        clon.setName("Camisa basica (clon)");
        ropa.add(new ProductLeaf(clon));
        printTree(ropa, 0);
    }

    // Funcion recursiva para imprimir el arbol de inventario
    private static void printTree(InventoryComponent node, int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + "- " + node.getName() + " (stock: " + node.getStock() + ")");
        for (InventoryComponent child : node.getChildren()) {
            printTree(child, level + 1);
        }
    }
}
