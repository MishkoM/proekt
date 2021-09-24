package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Cart;
import model.Customer;
import model.CustomerOrder;
import repository.CartRepository;
import repository.CustomerRepository;
import repository.OrderRepository;


@RestController
public class OrderController {

	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CartRepository cartRepository;
	
	@RequestMapping("/order/{cartId}")
	public String createOrder(@PathVariable int cartId) {
		CustomerOrder customerOrder = new CustomerOrder();
		
		customerOrder.setCart(cartRepository.findById(cartId));
		
		Customer customer = Cart.getCustomer();
		customerOrder.setCustomer(customer);
		customerOrder.setBillingAddress(customer.getBillingAddress());
		customerOrder.setShippingAddress(customer.getShippingAddress());
		
		orderRepository.save(customerOrder);
		
		return customerOrder.toString();
	}
	
}
