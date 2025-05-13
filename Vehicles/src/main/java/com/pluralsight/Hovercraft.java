package com.pluralsight;

public class Hovercraft extends Vehicle {
    private double hoverHeight;

    public Hovercraft(int vin, int year, String make, String model, String color, int mileage,
                 double price, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(vin, year, make, model, color, mileage,
                price, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hoverHeight = 0.0;
    }

    public double getHoverHeight(){
        return this.hoverHeight;
    }
    public void hover(double height){
        if (height < 0) {
            System.out.println("Hover height cannot be negative.");
            return;
        }
        this.hoverHeight = height;
    }

    public boolean isHovering(){
        return this.hoverHeight >= 0.0;
    }

    public void land() {
        this.hoverHeight = 0;
        System.out.println("Hovercraft has landed.");
    }
}
