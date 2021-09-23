package repository;

import org.springframework.data.repository.CrudRepository;

import model.CustomerOrder;

public interface OrderRepository extends CrudRepository<CustomerOrder, Long>{

}
