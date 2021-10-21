package eProdavnica.demo.repository;

import org.springframework.data.repository.CrudRepository;

import eProdavnica.demo.model.CustomerOrder;

public interface OrderRepository extends CrudRepository<CustomerOrder, Long>{

}
