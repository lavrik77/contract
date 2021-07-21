package ru.lavrinenko.inserance.contract.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lavrinenko.inserance.contract.dto.CustomerDTO;
import ru.lavrinenko.inserance.contract.model.Customer;
import ru.lavrinenko.inserance.contract.repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  @Autowired
  private AdapterService adapterService;

  public List<CustomerDTO> getUsersList() {
    return adapterService.getCustomerDTOList(customerRepository.findAll());
  }

  public CustomerDTO getCustomer(Long id) {
    return adapterService.getCustomerDTO(customerRepository.getCustomer(id));
  }
}
