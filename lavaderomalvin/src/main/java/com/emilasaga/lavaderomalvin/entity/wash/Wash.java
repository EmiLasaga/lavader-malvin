package com.emilasaga.lavaderomalvin.entity.wash;

import com.emilasaga.lavaderomalvin.entity.wash.enums.WashStatus;
import com.emilasaga.lavaderomalvin.entity.wash.enums.WashType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

@Entity
@Table(name = "wash")
public class Wash {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "client_name")
    @NonNull
    private String clientName;

    @Column(name = "client_last_name")
    @NonNull
    private String clientLastName;

    @Column(name = "client_email")
    private String clientEmail;

    @Column(name = "client_phone_no")
    @NonNull
    private long clientPhoneNo;

    @Column(name = "wash_type")
    @NonNull
    private WashType washType;

    @Column(name = "wash_amounts")
    private int washAmounts;

    @Column(name = "cost")
    private int cost;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private WashStatus status;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDate createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDate updatedAt;

    public Wash(@NonNull String clientName, @NonNull String clientLastName, String clientEmail,
                long clientPhoneNo, @NonNull WashType washType,
                int wash_amounts, String description, int cost) {
        this.clientName = clientName;
        this.clientLastName = clientLastName;
        this.clientEmail = clientEmail;
        this.clientPhoneNo = clientPhoneNo;
        this.washType = washType;
        this.washAmounts = wash_amounts;
        this.description = description;
        this.status = WashStatus.CREATED;
        this.cost = cost;
    }

    public Wash() {

    }

    public int getCost() {
        return cost;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NonNull
    public String getClientName() {
        return clientName;
    }

    public void setClientName(@NonNull String clientName) {
        this.clientName = clientName;
    }

    @NonNull
    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(@NonNull String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public long getClientPhoneNo() {
        return clientPhoneNo;
    }

    public void setClientPhoneNo(long clientPhoneNo) {
        this.clientPhoneNo = clientPhoneNo;
    }

    @NonNull
    public WashType getWashType() {
        return washType;
    }

    public void setWashType(@NonNull WashType washType) {
        this.washType = washType;
    }

    public int getWashAmounts() {
        return washAmounts;
    }

    public void setWashAmounts(int wash_amounts) {
        this.washAmounts = wash_amounts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WashStatus getStatus() {
        return status;
    }

    public void setStatus(WashStatus status) {
        this.status = status;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
