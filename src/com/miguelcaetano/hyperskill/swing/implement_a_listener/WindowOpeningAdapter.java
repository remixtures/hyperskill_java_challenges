package com.miguelcaetano.hyperskill.swing.implement_a_listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowOpeningAdapter extends WindowAdapter {
    // override an event called after window opening

    @Override
    public void windowOpened(WindowEvent e) {
        super.windowOpened(e);
        System.out.println("Window is opened");
    }
}