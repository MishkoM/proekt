package eProdavnica.demo.repository;

import org.springframework.data.repository.CrudRepository;

import eProdavnica.demo.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer>{

}