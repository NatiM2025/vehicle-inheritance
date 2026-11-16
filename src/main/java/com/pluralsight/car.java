package com.pluralsight;

public class car extends Vehicle {
    private int numberOfDoors;

    public void openTrunk() {
        System.out.println("car trunk opened");
    }
    public void closeTrunk() {
        System.out.println("car trunk closed");
    }
}
