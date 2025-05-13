package com.pluralsight;

public class SemiTruck extends Vehicle {
    private double cargoAmount;

    public SemiTruck(int vin, int year, String make, String model, String color, int mileage,
                     double price, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(vin, year, make, model, color, mileage,
                price, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.cargoAmount = 0.0;
    }

    public void load(double addedCargo) {
        this.cargoAmount += addedCargo;
    }

    public void unload(double unloadedCargo) {
        this.cargoAmount -= unloadedCargo;
    }

    public double getRemainingCapacity() {
        return this.getCargoCapacity() - this.cargoAmount;
    }
}
