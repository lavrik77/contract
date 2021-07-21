package ru.lavrinenko.inserance.contract.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.lavrinenko.inserance.contract.model.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

  Contract getContractById(Long id);

}
