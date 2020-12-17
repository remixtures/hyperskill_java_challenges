package com.miguelcaetano.hyperskill.design_patterns.coffee_decorator;

import java.util.Locale;

public class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Coffee simpleEspresso = new Espresso();
        System.out.println("Espresso" + " $" + formatSum(simpleEspresso.cost()));

        Coffee espressoWithDecor = new Espresso();
        espressoWithDecor = new Sugar(new Milk(espressoWithDecor));
        System.out.println(espressoWithDecor.getDescription()  + " $" + formatSum(espressoWithDecor.cost()));

        Coffee instantWithDecor = new InstantCoffee();
        instantWithDecor = new Sugar(new Sugar(new Sugar(new Whip(instantWithDecor))));
        System.out.println(instantWithDecor.getDescription() + " $" + formatSum(instantWithDecor.cost()));

        System.out.println("I'm drinking my " + instantWithDecor.getDescription());
        Thread.sleep(1500);
        System.out.println("-I want to add some Whip to my coffee. And don't make a new one! Just add Whip");
        Thread.sleep(1500);
        System.out.println("-Okay! But the final price will change");
        Thread.sleep(1500);
        System.out.println("-I understand");

        instantWithDecor = new Whip(instantWithDecor);
        System.out.println(instantWithDecor.getDescription() + " $" + formatSum(instantWithDecor.cost()));
    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Coffee {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}

class Espresso extends Coffee {

    Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}

class InstantCoffee extends Coffee {

    InstantCoffee() {
        description = "Instant Coffee";
    }

    @Override
    double cost() {
        return 1.0;
    }
}

abstract class Decorator extends Coffee {
    abstract String getDescription();
}

class Milk extends Decorator {

    private Coffee coffee;

    Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    double cost() {
        return .13 + coffee.cost();
    }
}

class Sugar extends Decorator {

    private Coffee coffee;

    Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    double cost() {
        return .02 + coffee.cost();
    }
}

class Whip extends Decorator {

    private Coffee coffee;

    Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Whip";
    }

    @Override
    double cost() {
        return .10 + coffee.cost();
    }
}
