package com.miguelcaetano.hyperskill.object_oriented_programming.who_is_who;

class Determiner {

    public static void determineWhoIsWho(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee instanceof  Developer) {
                System.out.println("DEV");
            } else if (employee instanceof DataAnalyst) {
                System.out.println("DA");
            } else {
                System.out.println("EMP");
            }
        }
    }
}
