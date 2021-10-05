package eProdavnica.demo.repository;
import org.springframework.data.repository.CrudRepository;

import eProdavnica.demo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
