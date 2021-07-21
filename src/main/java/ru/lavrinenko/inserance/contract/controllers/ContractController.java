package ru.lavrinenko.inserance.contract.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import ru.lavrinenko.inserance.contract.dto.ContractDTO;
import ru.lavrinenko.inserance.contract.services.ContractService;

import java.util.List;

@RestController
public class ContractController {

  @Autowired
  private ContractService contractService;

  @GetMapping(path = "/api/contract/list")
  public List<ContractDTO> getContracts() {
    return contractService.getContracts();
  }

  @GetMapping(path = "/api/contract/{id}")
  public ContractDTO getContracts(@PathVariable Long id) {
    return contractService.getContract(id);
  }

  private String getSessionId() {
    return RequestContextHolder.currentRequestAttributes().getSessionId();
  }
}
