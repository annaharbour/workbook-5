package com.pluralsight.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Asset {
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

    public LocalDateTime getDateAcquired() {
        return this.dateAcquired;
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

    public BigDecimal getValue(){
        return this.originalCost;
    };
}
