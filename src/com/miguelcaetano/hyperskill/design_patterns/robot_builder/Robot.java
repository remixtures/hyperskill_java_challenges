package com.miguelcaetano.hyperskill.design_patterns.robot_builder;

import java.util.Scanner;

class Robot {

    private String cpu;
    private int legs;
    private int hands;
    private int eyes;

    Robot(String cpu, int legs, int hands, int eyes) {
        this.cpu = cpu;
        this.legs = legs;
        this.hands = hands;
        this.eyes = eyes;
    }

    public static class RobotBuilder {

        private String cpu;
        private int legs;
        private int hands;
        private int eyes;

        /* write your code here (fields) */

        RobotBuilder setCPU(String cpu) {
            /* write your code here */
            this.cpu = cpu;
            return this;
        }

        RobotBuilder setLegs(int legs) {
            /* write your code here */
            this.legs = legs;
            return this;
        }

        RobotBuilder setHands(int hands) {
            /* write your code here */
            this.hands = hands;
            return this;
        }

        RobotBuilder setEyes(int eyes) {
            /* write your code here */
            this.eyes = eyes;
            return this;
        }

        Robot build() {
            /* write your code here */
            return new Robot(cpu, legs, hands, eyes);
        }
    }

    @Override
    public String toString() {
        return "CPU : " + cpu + "\n" +
                "Legs : " + legs + "\n" +
                "Hands : " + hands + "\n" +
                "Eyes : " + eyes + "\n";
    }
}

class TestDrive {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder();

        /* Set CPU */
        robotBuilder.setCPU("Intel Core i5");
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        /* Would like to set hands? */
        int hands = scanner.nextInt();
        /* Would like to set eyes? */
        int eyes = scanner.nextInt();

        Robot robot = robotBuilder.setLegs(legs).setHands(hands).setEyes(eyes).build();
        System.out.println(robot);
        scanner.close();
    }
}
