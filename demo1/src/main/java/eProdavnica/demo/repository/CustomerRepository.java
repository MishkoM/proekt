package eProdavnica.demo.repository;

import org.springframework.data.repository.CrudRepository;

import eProdavnica.demo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
