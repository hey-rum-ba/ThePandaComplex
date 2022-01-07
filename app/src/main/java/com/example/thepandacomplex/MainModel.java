package com.example.thepandacomplex;

public class MainModel {
    int roomNo, lastRent, electricity, noOfRentee, image;
    String name;

    public MainModel(int image, int lastRent, int roomNo, int electricity, int noOfRentee, String name){
        this.image = image;
        this.electricity =electricity;
        this.noOfRentee= noOfRentee;
        this.lastRent= lastRent;
        this.roomNo =roomNo;
        this.name=name;
    }

    public MainModel() {
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
