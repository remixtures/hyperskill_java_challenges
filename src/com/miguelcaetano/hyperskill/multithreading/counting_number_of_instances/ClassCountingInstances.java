package com.miguelcaetano.hyperskill.multithreading.counting_number_of_instances;

class ClassCountingInstances {

    private static long numberOfInstances;

    public ClassCountingInstances() {
        // write the increment here
        synchronized (ClassCountingInstances.class) {
            numberOfInstances++;
        }
    }

    public static synchronized long getNumberOfInstances() {
        return numberOfInstances;
    }
}