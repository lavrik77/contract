package ru.lavrinenko.inserance.contract.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String state;
    private String zipCode;
    private String territory;
    private String district;
    private String locality;
    private String street;
    private String house;
    private String building;
    private String apartment;
    private String comment;
    @ManyToOne
    private Customer owner;
}
