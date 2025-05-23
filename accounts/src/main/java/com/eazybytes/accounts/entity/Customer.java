package com.eazybytes.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String email;
    private String mobileNumber;
}