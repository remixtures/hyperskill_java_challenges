package com.miguelcaetano.hyperskill.design_patterns.undo_command;

public class Main {

    public static void main(String[] args) {
        Command myCommand = new CommandPutItem();
        Storable myStorableEntity = new StorableEntity();
        ((CommandPutItem) myCommand).entity = myStorableEntity;
        ((CommandPutItem) myCommand).item = "";
        ((StorableEntity) myStorableEntity).myArray = new String[]{ "Your Welcome :)", "also you can add as many strings as you want" };

        myCommand.execute();
        //Scaffold for testing storable ^


        ((CommandMove) myCommand).entity = new MovableEntity();
        Movable myMovableEntity = new MovableEntity();
        myMovableEntity.setX(0);
        myMovableEntity.setY(0);

        myCommand.execute();
        //Scaffold for testing movable ^
    }

}
