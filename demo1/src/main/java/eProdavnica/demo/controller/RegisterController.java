package eProdavnica.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eProdavnica.demo.model.BillingAddress;
import eProdavnica.demo.model.Customer;
import eProdavnica.demo.model.ShippingAddress;
import eProdavnica.demo.repository.CustomerRepository;

@RestController
public class RegisterController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping("/register")
	public String registerCustomer(Model model) {
		
		Customer customer = new Customer();
		BillingAddress billingAddress = new BillingAddress();
		ShippingAddress shippingAddress = new ShippingAddress();
		customer.setBillingAddress(billingAddress);
		customer.setShippingAddress(shippingAddress);
		
		model.addAttribute("customer", customer);
		return "registerCustomer";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerCustomerPost(@Validated @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "registerCustomer";
		}
		
		List<Customer> customerList = (List<Customer>) customerRepository.findAll();
		
		for (int i=0; i < customerList.size(); i++) {
			if(customer.getCustomerEmail().equals(customerList.get(i).getCustomerEmail())) {
				model.addAttribute("emailMsg", "Email alredy exists");
				
				return "registerCustomer";
			}
			
			if(customer.getUsername().equals(customerList.get(i).getUsername())) {
				model.addAttribute("UsernameMsg", "Username alredy exists");
				return "registerCustomer";
			}
		}
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(customer.getPassword());
		customer.setPassword(hashedPassword);
		
		customerRepository.save(customer);
		
		return "registerCustomerSucces";
	}
	
}
