package com.emilasaga.lavaderomalvin.core.wash.dtos;

import com.emilasaga.lavaderomalvin.core.wash.enums.WashStatus;
import com.emilasaga.lavaderomalvin.core.wash.enums.WashType;

import java.time.LocalDateTime;

public class WashDTO {

    final private String clientName;

    final private String clientLastName;

    final private String clientEmail;

    final private long clientPhoneNo;

    final private WashType washType;

    final private int washAmounts;

    final private int cost;

    final private String description;

    final private WashStatus status;

    final private LocalDateTime updatedAt;

    public WashDTO(String clientName, String clientLastName, String clientEmail, long clientPhoneNo, WashType washType, int washAmounts, int cost, String description, WashStatus status, LocalDateTime updatedAt) {
        this.clientName = clientName;
        this.clientLastName = clientLastName;
        this.clientEmail = clientEmail;
        this.clientPhoneNo = clientPhoneNo;
        this.washType = washType;
        this.washAmounts = washAmounts;
        this.cost = cost;
        this.description = description;
        this.status = status;
        this.updatedAt = updatedAt;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public long getClientPhoneNo() {
        return clientPhoneNo;
    }

    public WashType getWashType() {
        return washType;
    }

    public int getWashAmounts() {
        return washAmounts;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public WashStatus getStatus() {
        return status;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
