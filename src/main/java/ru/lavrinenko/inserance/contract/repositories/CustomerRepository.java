package ru.lavrinenko.inserance.contract.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.lavrinenko.inserance.contract.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

  @Query("select c from Customer c where c.id = :id")
  Customer getCustomer(@Param("id")Long id);
}
