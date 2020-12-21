package com.miguelcaetano.hyperskill.design_patterns.fix_me;

import java.util.*;

/** Observable */
interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}

/** Concrete Observable */
class RockstarGames implements Observable {

    public String releaseGame;
    /** write your code here ... */
    private List<Observer> observers = new ArrayList<>();

    public void release(String game) {
        this.releaseGame = game;
        /** write your code here ... */
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
            System.out.println("Inform message to : " + observer);
            observer.update(releaseGame);
        }
    }
}

/** Observer */
interface Observer {
    public void update(String domain);
}

/** Concrete Observer */
class Gamer implements Observer {

    private String name;
    private String reaction;
    /** write your code here ... */

    private Set<String> games = new HashSet<>();

    public Gamer(String name, String reaction) {
        this.reaction = reaction;
        /** write your code here ... */
        this.name = name;
    }

    /** write your code here ... */
    @Override
    public void update(String game) {
        buyGame(game);
    }

    public void buyGame(String game) {
        games.add(game);
        System.out.println(this.name + " says: " + reaction);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

/** Main Class */

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        String game = null;

        /** write your code here ... */
        RockstarGames rockstarGames = new RockstarGames();

        Gamer garry = new Gamer("Garry Rose", "I want to pre-order");
        Gamer peter = new Gamer("Peter Johnston", "Pinch me...");
        Gamer helen = new Gamer("Helen Jack", "Jesus, it's new game from Rockstar!");

        /** write your code here ... */
        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        game = scanner.nextLine();
        System.out.println("It's happened! RockstarGames releases new game - " + game + "!");
        rockstarGames.release(game);

        /** write your code here ... */

        scanner.close();
    }
}
