package com.tiendaderopa.command;

public interface InventoryCommand {
    void execute();
    void undo();
}
