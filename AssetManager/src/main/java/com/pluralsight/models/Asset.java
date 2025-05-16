package com.pluralsight.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Asset {
    private String description;
    private LocalDateTime dateAcquired;
    private BigDecimal originalCost;

    public Asset(String description, LocalDateTime dateAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return this.dateAcquired.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void setDateAcquired(LocalDateTime dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public BigDecimal getOriginalCost() {
        return this.originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public abstract BigDecimal getValue();
}
