package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int numberOfTrailers;

    public void loadCargo() {
        System.out.println("cargo loaded");
    }
    public void unLoadCargo() {
        System.out.println("cargoUnLoaded");
    }
}
