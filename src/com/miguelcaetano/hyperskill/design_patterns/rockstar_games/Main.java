package com.miguelcaetano.hyperskill.design_patterns.rockstar_games;

import java.util.*;

/**
 * Observable interface
 **/
interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

/**
 * Concrete Observable - Rockstar Games
 **/
class RockstarGames implements Observable {

    public String releaseGame;
    private List<Observer> observers = new ArrayList<>();

    public void release(String releaseGame) {
        this.releaseGame = releaseGame;
        // write your code here ...
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        // write your code here ...
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // write your code here ...
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

    @Override
    public void update(String game) {
        buyGame(game);
    }

    public void buyGame(String game) {
        System.out.println(name + " says : \"Oh, Rockstar releases new game " + game + " !\"");
        games.add(game);
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

        game = scanner.nextLine();
        rockstarGames.release(game);

        scanner.close();
    }
}