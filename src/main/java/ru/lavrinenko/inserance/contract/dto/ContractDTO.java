package ru.lavrinenko.inserance.contract.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class ContractDTO {

    private long id;
    private String serialNumber;
    private LocalDate date;
    private CustomerDTO customer;
    private int prize;
    private LocalDate startDate;
    private LocalDate endDate;
}
