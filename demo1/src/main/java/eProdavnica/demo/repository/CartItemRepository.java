package eProdavnica.demo.repository;


import org.springframework.data.repository.CrudRepository;

import eProdavnica.demo.model.CartItem;


public interface CartItemRepository extends CrudRepository<CartItem, Integer>{

}
