package com.petproject.logistics_shield.persistence.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Item extends BaseEntity {
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private String category;
    private String serialNumber;
    private ItemStatus status;
    private LocalDate expirationDate; //for medicaments

}
