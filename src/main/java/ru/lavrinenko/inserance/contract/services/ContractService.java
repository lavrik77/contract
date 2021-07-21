package ru.lavrinenko.inserance.contract.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lavrinenko.inserance.contract.dto.ContractDTO;
import ru.lavrinenko.inserance.contract.repositories.ContractRepository;

import java.util.List;

@Service
public class ContractService {

  @Autowired
  private ContractRepository contractRepository;

  @Autowired
  private AdapterService adapterService;

  public List<ContractDTO> getContracts() {
    return adapterService.getContractDTOList(contractRepository.findAll());
  }

  public ContractDTO getContract(Long id) {
    return adapterService.getContractDTO(contractRepository.getContractById(id));
  }

}
