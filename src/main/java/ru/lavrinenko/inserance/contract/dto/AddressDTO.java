package ru.lavrinenko.inserance.contract.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
public class AddressDTO {

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
}
