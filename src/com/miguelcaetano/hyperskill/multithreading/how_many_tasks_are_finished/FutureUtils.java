package com.miguelcaetano.hyperskill.multithreading.how_many_tasks_are_finished;

import java.util.*;
import java.util.concurrent.*;

public class FutureUtils {

    public static int howManyIsDone(List<Future> items) {

        int finishedFutureObjects = 0;
        for (Future item : items) {
            if (item.isDone()) {
                finishedFutureObjects++;
            }
        }

        return finishedFutureObjects;
    }
}