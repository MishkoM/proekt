package repository;

import org.springframework.data.repository.CrudRepository;

import model.CartItem;

public interface CartItemRepository extends CrudRepository<CartItem, Integer>{

	void delete(Long productId);

}
