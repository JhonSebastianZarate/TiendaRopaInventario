package com.tiendaderopa.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class InventoryInvoker {
    private final Deque<InventoryCommand> history = new ArrayDeque<>();

    public void apply(InventoryCommand c) {
        c.execute();
        history.push(c);
    }

    public boolean undo() {
        if (history.isEmpty()) return false;
        history.pop().undo();
        return true;
    }
}
