package com.example.thepandacomplex;

public class FirebaseHelper {
    String name;
    int lastRent, electricity, noOfRentee ;

    public FirebaseHelper(String name, int lastDate, int noOfRentee, int electricity) {
        this.lastRent = lastRent;
        this.electricity = electricity;
        this.noOfRentee = noOfRentee;
        this.name = name;
    }

    public FirebaseHelper() {
    }

    public int getLastRent() {
        return lastRent;
    }

    public void setLastRent(int lastRent) {
        this.lastRent = lastRent;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getNoOfRentee() {
        return noOfRentee;
    }

    public void setNoOfRentee(int noOfRentee) {
        this.noOfRentee = noOfRentee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
