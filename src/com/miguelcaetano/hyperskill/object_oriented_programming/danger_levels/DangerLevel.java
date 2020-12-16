package com.miguelcaetano.hyperskill.object_oriented_programming.danger_levels;

enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int level;

    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}