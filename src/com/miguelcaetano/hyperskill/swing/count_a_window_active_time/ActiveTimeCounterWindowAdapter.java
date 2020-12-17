package com.miguelcaetano.hyperskill.swing.count_a_window_active_time;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ActiveTimeCounterWindowAdapter extends WindowAdapter {
    private long activationCounter = 0; // do not change it

    @Override
    public void windowActivated(WindowEvent e) {
        super.windowActivated(e);
        activationCounter++;
    }

    // override a method
}
