package com.pluralsight;

import com.pluralsight.models.Asset;
import com.pluralsight.models.House;
import com.pluralsight.models.Vehicle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AssetManagerApp {
    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();
        Asset house = new House(
                "Beautiful family home",
                LocalDateTime.now(),
                new BigDecimal("250000"),
                "123 Main Street, Springfield",
                1, // excellent condition
                2000, // square feet
                5000 // lot size in square feet
        );

        Asset cabin = new House(
                "cozy cottage",
                LocalDateTime.now().minusYears(8).minusMonths(6),
                new BigDecimal("80000"),
                "100 Mountain View, Oklahoma",
                3, // excellent condition
                1000, // square feet
                2000 // lot size in square feet
        );
        Asset motorBike = new Vehicle(
                "Sporty motorcycle",
                LocalDateTime.now().minusYears(2),
                new BigDecimal("15000"),
                "Yamaha R1",
                2021,
                12000 // odometer in miles
        );
        Asset car = new Vehicle(
                "My car",
                LocalDateTime.now().minusYears(1),
                new BigDecimal("15000"),
                "Honda Civic",
                2024,
                10000 // odometer in miles
        );
        assets.add(motorBike);
        assets.add(car);
        assets.add(house);
        assets.add(cabin);

        System.out.println("Assets: ");
        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Cost Basis: " + asset.getOriginalCost());
            System.out.println("Value: " + asset.getValue());

            if (asset instanceof House houseAsset) {
                System.out.println("Address: " + houseAsset.getAddress());
            } else if (asset instanceof Vehicle vehicleAsset) {
                System.out.println("Year: " + vehicleAsset.getYear());
                System.out.println("Make/Model: " + vehicleAsset.getMakeModel());
            }
            System.out.println();
        }
    }
}