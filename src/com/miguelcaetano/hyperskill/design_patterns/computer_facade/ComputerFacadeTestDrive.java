package com.miguelcaetano.hyperskill.design_patterns.computer_facade;

class ComputerFacadeTestDrive {
    public static void main(String[] args) throws InterruptedException {
        /* Your subsystems */
        Processor intelI7 = new Processor();
        Monitor asus27 = new Monitor();
        Keyboard microsoftErgonomic = new Keyboard();

        ComputerFacade computerFacade = new ComputerFacade(intelI7, asus27, microsoftErgonomic);

        computerFacade.turnOnComputer();
        Thread.sleep(1500);
        computerFacade.turnOffComputer();
    }
}

class ComputerFacade {
    /* Your subsystems */
    private Processor processor;
    private Monitor monitor;
    private Keyboard keyboard;

    public ComputerFacade(Processor processor, Monitor monitor, Keyboard keyboard) {
        /* Write your code here */
        this.processor = processor;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public void turnOnComputer() {
        /* Write your code here */
        processor.on();
        monitor.on();
        keyboard.on();
        keyboard.turnOnBacklight();
    }

    public void turnOffComputer() {
        /* Write your code here */
        keyboard.off();
        keyboard.turnOffBacklight();
        monitor.off();
        processor.off();
    }
}

class Processor {
    /* Your subsystem description */
    private String description;

    public Processor() {
        this.description = "Processor";
    }

    public void on() {
        /* Write your code here */
        System.out.println(description + " on");
    }

    public void off() {
        /* Write your code here */
        System.out.println(description + " off");
    }
}

class Monitor {
    /* Your subsystem description */
    private String description;

    public Monitor() {
        this.description = "Monitor";
    }

    public void on() {
        /* Write your code here */
        System.out.println(description + " on");
    }

    public void off() {
        /* Write your code here */
        System.out.println(description + " off");
    }
}

class Keyboard {
    /* Your subsystem description */
    private String description;

    public Keyboard() {
        this.description = "Keyboard";
    }

    public void on() {
        /* Write your code here */
        System.out.println(description + " on");
    }

    public void off() {
        /* Write your code here */
        System.out.println(description + " off");
    }

    protected void turnOnBacklight() {
        /* Write your code here */
        System.out.println("Backlight is turned on");
    }

    protected void turnOffBacklight() {
        /* Write your code here */
        System.out.println("Backlight is turned off");
    }
}