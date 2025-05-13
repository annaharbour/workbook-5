package com.pluralsight.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, LocalDateTime dateAcquired, BigDecimal originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {
        // A car's value is determined as
        // 0-3 years old - 3% reduced value of cost per year
        // 4-6 years old - 6% reduced value of cost per year
        // 7-10 years old - 8% reduced value of cost per year
        // over 10 years old - $1000.00
        // MINUS reduce final value by 25% if over 100,000 miles
        // unless makeModel contains word Honda or Toyota
        // Placeholder logic for vehicle value calculation
        int yearsOld = this.getYear() - LocalDateTime.now().getYear();
        BigDecimal value = this.getOriginalCost();
        if (yearsOld >= 0 && yearsOld <= 3) {
            value = value.subtract(BigDecimal.valueOf(0.03).multiply(this.getOriginalCost()));
        } else if (yearsOld >= 4 && yearsOld <= 6){
            value = value.subtract(BigDecimal.valueOf(0.06).multiply(this.getOriginalCost()));
        } else if (yearsOld >= 7 && yearsOld <= 10){
            value = value.subtract(BigDecimal.valueOf(0.08).multiply(this.getOriginalCost()));
        } else {
            value = value.subtract(BigDecimal.valueOf(1000));
        }

        if(this.getOdometer() > 100000){
             if(!makeModel.contains("Honda") && !makeModel.contains("Toyota")){
                 BigDecimal finalValue = value;
                 finalValue = value.subtract(BigDecimal.valueOf(.25).multiply(value));
                 return finalValue;
             }
        }
        return value;

    }
}
