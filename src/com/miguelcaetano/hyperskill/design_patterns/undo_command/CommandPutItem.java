package com.miguelcaetano.hyperskill.design_patterns.undo_command;

import java.util.Objects;

public class CommandPutItem implements Command {
    Storable entity;
    String item;


    @Override
    public void execute() {
        for (int i = 0; i <= entity.getInventoryLength() - 1; i++) {
            if (entity.getInventoryItem(i) != null) {
                entity.setInventoryItem(i, item);
                break;
            }
        }
    }

    @Override
    public void undo() {
        for (int i = entity.getInventoryLength() - 1; i >= 0;  i--) {
            if (!Objects.isNull(entity.getInventoryItem(i)) && entity.getInventoryItem(i).equals(item)) {
                entity.setInventoryItem(i, null);
                break;
            }
        }
    }
}
