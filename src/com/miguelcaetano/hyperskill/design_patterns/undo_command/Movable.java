package com.miguelcaetano.hyperskill.design_patterns.undo_command;

public interface Movable {
    int getX();
    int getY();
    void setX(int newX);
    void setY(int newY);
}
