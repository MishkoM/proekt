package repository;

import org.springframework.data.repository.CrudRepository;

import model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	Object findOne(int id);

	Product findOne(Long productId);

}
