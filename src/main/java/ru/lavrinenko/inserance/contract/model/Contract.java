package ru.lavrinenko.inserance.contract.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Contract implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String serialNumber;
    private LocalDate date;
    @ManyToOne
    private Customer customer;
    @OneToMany
    @JoinColumn(name = "id")
    private Set<Address> address;
    private int prize;
    private LocalDate startDate;
    private LocalDate endDate;

}
