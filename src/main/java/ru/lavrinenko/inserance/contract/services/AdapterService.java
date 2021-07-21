package ru.lavrinenko.inserance.contract.services;

import org.springframework.stereotype.Service;
import ru.lavrinenko.inserance.contract.dto.ContractDTO;
import ru.lavrinenko.inserance.contract.dto.CustomerDTO;
import ru.lavrinenko.inserance.contract.model.Contract;
import ru.lavrinenko.inserance.contract.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdapterService {

  static final String SHORT_DATE_FORMAT = "dd.MM.yyyy";

  public List<ContractDTO> getContractDTOList(List<Contract> list) {
    List<ContractDTO> dtoList = new ArrayList<>();
    for (Contract c: list) {
      dtoList.add(getContractDTO(c));
    }
    return dtoList;
  }

  public ContractDTO getContractDTO(Contract contract) {
    ContractDTO contractDTO = new ContractDTO();
    contractDTO.setCustomer(getCustomerDTO(contract.getCustomer()));
    contractDTO.setDate(contract.getDate());//.format(DateTimeFormatter.ofPattern(SHORT_DATE_FORMAT)));
    contractDTO.setId(contract.getId());
    contractDTO.setPrize(contract.getPrize());
    contractDTO.setSerialNumber(contract.getSerialNumber());
    contractDTO.setStartDate(contract.getStartDate());//.format(DateTimeFormatter.ofPattern(SHORT_DATE_FORMAT)));
    contractDTO.setEndDate(contract.getEndDate());//.format(DateTimeFormatter.ofPattern(SHORT_DATE_FORMAT)));
    return contractDTO;
  }

  private String getFIO(Customer customer) {
    String fio = customer.getSurname();
    fio += " " + customer.getName().substring(0, 1) + ".";
    fio += customer.getMiddle().isEmpty() || customer.getMiddle() == null?"":customer.getMiddle().substring(0, 1) + ".";
    return fio;
  }

  public List<CustomerDTO> getCustomerDTOList(List<Customer> list) {
    List<CustomerDTO> dtoList = new ArrayList<>();
    for (Customer c: list) {
      dtoList.add(getCustomerDTO(c));
    }
    return dtoList;
  }

  public CustomerDTO getCustomerDTO(Customer customer) {
    CustomerDTO customerDTO = new CustomerDTO();
    customerDTO.setId(customer.getId());
    customerDTO.setName(customer.getName());
    customerDTO.setSurname(customer.getSurname());
    customerDTO.setMiddle(customer.getMiddle());
    customerDTO.setBirthday(customer.getBirthday());
    customerDTO.setSerial(customer.getSerial());
    customerDTO.setNumber(customer.getNumber());
    return customerDTO;
  }

}
