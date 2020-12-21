package com.miguelcaetano.hyperskill.design_patterns.a_new_rockstar_game;

import java.util.*;

/**
 * Observable interface
 **/
interface Observable {
    // write your code here ...
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}

/**
 * Concrete Observable - Rockstar Games
 **/
class RockstarGames implements Observable {

    public String releaseGame;
    private List<Observer> observers = new ArrayList<>();

    // write your code here ...

    public void release(String game) {
        this.releaseGame = game;
        // write your code here ...
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            System.out.println("Notification for gamer : " + observer);
            observer.update(releaseGame);
        }
    }

}

/**
 * Observer interface
 **/
interface Observer {
    // write your code here ...
    public void update(String domain);
}

/**
 * Concrete observer - Gamer
 **/
class Gamer implements Observer {

    private String name;
    private Set<String> games = new HashSet<>();

    public Gamer(String name) {
        this.name = name;
    }

    // write your code here ...
    @Override
    public void update(String game) {
        buyGame(game);
    }

    public void buyGame(String game) {
        if (!games.contains(game)) {
            System.out.println(name + " says : \"Oh, Rockstar releases new game " + game + " !\"");
            games.add(game);
        } else {
            System.out.println("What? They've already released this game ... I don't understand");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}

/**
 * Main class
 **/
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String game = null;

        RockstarGames rockstarGames = new RockstarGames();

        Gamer garry = new Gamer("Garry Rose");
        Gamer peter = new Gamer("Peter Johnston");
        Gamer helen = new Gamer("Helen Jack");

        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        for (int i = 0; i < 2; i++) {
            game = scanner.nextLine();
            rockstarGames.release(game);
        }

        scanner.close();
    }
}
