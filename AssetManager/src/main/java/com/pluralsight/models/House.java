package com.pluralsight.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class House extends Asset {
    private String address;
    private int condition; // 1 - excellent, 2 - good, 3 - fair, 4 - poor
    private int squareFoot;
    private int lotSize;

    public House(String description, LocalDateTime dateAcquired, BigDecimal originalCost, String address,
                 int condition, int squareFoot, int lotSize) {
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

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
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
        double priceSqFt = 0.0;
        switch(this.getCondition()){
            case 1:
                priceSqFt = 180.00;
                break;
            case 2:
                priceSqFt = 130.00;
                break;
            case 3:
                priceSqFt = 90.00;
                break;
            case 4:
                priceSqFt = 80.00;
                break;
        }
        return new BigDecimal(this.getSquareFoot() * priceSqFt + .25 * (this.getLotSize()));
    }
}
