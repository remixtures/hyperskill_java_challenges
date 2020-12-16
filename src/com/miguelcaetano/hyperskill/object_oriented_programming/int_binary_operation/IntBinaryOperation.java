package com.miguelcaetano.hyperskill.object_oriented_programming.int_binary_operation;

abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

class Addition extends IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    @Override
    public int perform() {
        return firstArg + secondArg;
    }
}

class Multiplication extends IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}
