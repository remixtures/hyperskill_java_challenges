package com.miguelcaetano.hyperskill.design_patterns.undo_command;

public interface Command {
    void execute();
    void undo();
}
