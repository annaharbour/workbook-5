package com.pluralsight.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cash extends Asset {
    public Cash(String description, LocalDateTime dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public BigDecimal getValue() {
        return this.getOriginalCost();
    }
}
