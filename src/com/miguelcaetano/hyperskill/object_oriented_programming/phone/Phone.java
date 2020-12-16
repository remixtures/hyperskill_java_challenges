package com.miguelcaetano.hyperskill.object_oriented_programming.phone;

public class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    public Phone(String ownerName, String number) {
        this.ownerName = ownerName;
        this.number = number;
    }

    public Phone(String ownerName, String number, String countryCode, String cityCode) {
        this.ownerName = ownerName;
        this.number = number;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
    }

}