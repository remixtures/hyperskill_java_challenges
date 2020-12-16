package com.miguelcaetano.hyperskill.basic_syntax.convert_a_date;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String oldDate = input.next();

        String newDate = LocalDate.parse(oldDate,
                DateTimeFormatter.ofPattern("uuuu-MM-dd")
        ).format(
                DateTimeFormatter.ofPattern("MM/dd/uuuu"));

        System.out.println(newDate);
    }
}
