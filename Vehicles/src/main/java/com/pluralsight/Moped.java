package com.pluralsight;

public class Moped extends Vehicle {
//    public Moped(){
//        super();
//    }

    public Moped(int vin, int year, String make, String model, String color, int mileage,
                 double price, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(vin, year, make, model, color, mileage,
                price, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void doWheelie(){
        System.out.println("Woooooooooo wheelie");
    }
}
