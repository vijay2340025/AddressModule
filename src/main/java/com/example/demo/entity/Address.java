package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "address")
@Setter
@Getter
public class Address {
    @Id
    private int id;
    @Column
    private String houseNo;
    @Column
    private String streetName;
    @Column(name = "zip")
    private String zipCode;
    @Column
    private String country;
}
