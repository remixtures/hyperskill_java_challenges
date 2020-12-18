package com.miguelcaetano.hyperskill.design_patterns.undo_command;

class MovableEntity implements Movable {

    int X;
    int Y;

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }

    @Override
    public void setX(int newX) {
        this.X = X;
    }

    public void setY(int newY) {
        this.Y = Y;
    }
}
