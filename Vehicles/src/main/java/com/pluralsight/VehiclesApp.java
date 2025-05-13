package com.pluralsight;

public class VehiclesApp {
    public static void main(String[] args) {
//        can no longer declare with empty constructor / instantiate empty object that extends Vehicle because of
//        remove of parameterless constructor
//        Moped slowRide = new Moped();
//        slowRide.setColor("Red");
//        slowRide.setFuelCapacity(5);
//        slowRide.setMake("Honda");
//        slowRide.setModel("Metropolitan");
//        slowRide.setYear(2022);
//        slowRide.setMileage(100);
//        slowRide.setPrice(2500.00);
//        slowRide.setNumberOfPassengers(1);
//        slowRide.setCargoCapacity(10);
//        System.out.println(slowRide);
//        slowRide.doWheelie();
        SemiTruck semi = new SemiTruck(
                123456, 2023, "Freightliner", "Cascadia", "White", 120000, 135000.00, 2, 80000, 300
        );
        System.out.println(semi.getCargoCapacity());
        semi.load(3333);
        System.out.println(semi.getRemainingCapacity());

        Hovercraft hovercraft = new Hovercraft(
                789012, 2023, "AirRider", "X200", "Blue", 500, 75000.00, 4, 200, 100
        );
        System.out.println(hovercraft);
        hovercraft.hover(10.5);
//        able to call vehicle methods on subclasses
        System.out.println("Hovercraft color: " + hovercraft.getColor());
        System.out.println("Hovercraft is hovering at height: " + hovercraft.getHoverHeight());
        System.out.println("Is hovercraft hovering? " + hovercraft.isHovering());
        hovercraft.land();

    }
}