package com.miguelcaetano.hyperskill.object_oriented_programming.add_new_default_method;

interface Flying {
    // returns height of flying in meters
    int getHeight();

    // implements a default method getHeightInKm that returns height of flying in km as int type
    default int getHeightInKm() {
        return (int) getHeight() / 1000;
    }
}
