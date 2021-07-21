package ru.lavrinenko.inserance.contract.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CustomerDTO {
  private long id;
  private String surname;
  private String name;
  private String middle;
  private LocalDate birthday;
  private String serial;
  private String number;
}
