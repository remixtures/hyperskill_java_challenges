package com.miguelcaetano.hyperskill.object_oriented_programming.getting_the_fullname;

public class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        if (lastName == null) {
            return firstName;
        }

        if (firstName == null) {
            return lastName;
        }

        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        }

        return firstName + " " + lastName; // write your code here
    }
}