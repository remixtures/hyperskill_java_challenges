package com.miguelcaetano.hyperskill.design_patterns.undo_command;

public interface Storable {
    int getInventoryLength();
    String getInventoryItem(int index);
    void setInventoryItem(int index, String item);
}
