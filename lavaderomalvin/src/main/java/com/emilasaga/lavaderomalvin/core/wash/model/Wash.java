package com.emilasaga.lavaderomalvin.core.wash.model;

import com.emilasaga.lavaderomalvin.core.wash.enums.WashStatus;
import com.emilasaga.lavaderomalvin.core.wash.enums.WashType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "wash")
public class Wash {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "client_name")
    @NotBlank(message = "No puede estar vacio")
    private String clientName;

    @Column(name = "client_last_name")
    @NotBlank(message = "No puede estar vacio")
    private String clientLastName;

    @Column(name = "client_email")
    private String clientEmail;

    @Column(name = "client_phone_no")
    @Min(value = 1, message = "Tiene que ingresar un telefono")
    private long clientPhoneNo;

    @Column(name = "wash_type")
    private WashType washType;

    @Column(name = "wash_amounts")
    private int washAmounts;

    @Column(name = "cost")
    private int cost;

    @Column(name = "description")
    @NotBlank(message = "Describa lo que recibio")
    private String description;

    @Column(name = "status")
    private WashStatus status;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Wash() {

    }

    public int getCost() {
        return cost;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName( String clientName) {
        this.clientName = clientName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName( String clientLastName) {
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


    public WashType getWashType() {
        return washType;
    }

    public void setWashType( WashType washType) {
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
