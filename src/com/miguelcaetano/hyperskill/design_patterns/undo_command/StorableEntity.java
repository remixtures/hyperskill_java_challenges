package com.miguelcaetano.hyperskill.design_patterns.undo_command;

class StorableEntity implements Storable {

    String[] myArray;

    @Override
    public int getInventoryLength() {
        return myArray.length;
    }
    @Override
    public String getInventoryItem(int index) {
        return myArray[index];
    }
    @Override
    public void setInventoryItem(int index, String item) {
        myArray[index] = item;
    }
}
