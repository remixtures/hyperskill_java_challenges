package com.miguelcaetano.hyperskill.basic_syntax.advanced_calculator;

/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 1; i < args.length; i++) {
            int next = Integer.valueOf(args[i]);
            if (next > max) {
                max = next;
            }
            if (next < min) {
                min = next;
            }
            sum += next;
        }

        switch (operator) {
            case "MAX":
                System.out.println(max);
                break;
            case "MIN":
                System.out.println(min);
                break;
            case "SUM":
                System.out.println(sum);
                break;
            default:
                break;
        }
    }
}
