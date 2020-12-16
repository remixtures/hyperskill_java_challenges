package com.miguelcaetano.hyperskill.object_oriented_programming.system_of_units;

enum SI {

    M("length"),
    KG("mass"),
    S("time");

    public final String quantityName;

    SI(String quantityName) {
        this.quantityName = quantityName;
    }

    // implement getQuantity() method here

    public String getQuantity() {
        return this.quantityName;
    }
}
