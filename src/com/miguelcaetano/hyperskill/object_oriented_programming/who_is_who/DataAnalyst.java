package com.miguelcaetano.hyperskill.object_oriented_programming.who_is_who;

import java.util.Arrays;

class DataAnalyst extends Employee {

    private boolean phd;
    private String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods != null ? methods : null;
    }

    public boolean isPhD() {
        return phd;
    }

    public String[] getMethods() {
        return Arrays.copyOf(methods, methods.length);
    }
}
