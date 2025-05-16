package com.pluralsight.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class House extends Asset {
    private String address;
    private int squareFoot;
    private int lotSize;
    private condition condition;

    public enum condition {
        EXCELLENT(1, 180.00),
        GOOD(2, 130.00),
        FAIR(3, 90.00),
        POOR(4, 80.00);

        private int rating;
        private double pricePerSqFt;

        condition(int rating, double pricePerSqFt) {
            this.rating = rating;
            this.pricePerSqFt = pricePerSqFt;
        }

        public int getRating() {
            return rating;
        }

        public double getPricePerSqFt() {
            return pricePerSqFt;
        }
    }


    public House(String description, LocalDateTime dateAcquired, BigDecimal originalCost, String address,
                 condition condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public condition getCondition() {
        return this.condition;
    }

    public void setCondition(condition condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {
        // A house's value is determined as
        // $180.00 per square foot (excellent)
        // $130.00 per square foot (good)
        // $90.00 per square foot (fair)
        // $80.00 per square foot (poor)
        // PLUS 25 cents per square foot of lot size
        double priceSqFt = this.getCondition().getPricePerSqFt();
        return BigDecimal.valueOf(this.getSquareFoot() * priceSqFt + (0.25 * this.getLotSize()));
    }
}
