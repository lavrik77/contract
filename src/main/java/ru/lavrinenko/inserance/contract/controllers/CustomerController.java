package ru.lavrinenko.inserance.contract.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.lavrinenko.inserance.contract.dto.CustomerDTO;
import ru.lavrinenko.inserance.contract.services.CustomerService;

import java.util.List;

@RestController
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping(path = "/api/user/list")
  public List<CustomerDTO> typeEnums() {
    return customerService.getUsersList();
  }

  @GetMapping(path = "/api/user/{id}")
  public CustomerDTO getCustomer(@PathVariable Long id) {
    return customerService.getCustomer(id);
  }

}
