package eProdavnica.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eProdavnica.demo.model.Product;
import eProdavnica.demo.repository.ProductRepository;


@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@RequestMapping("/product/{id}")
	public String product(@PathVariable int id, Model model) {
		model.addAttribute("product", productRepository.findById((long) id));
		return "product";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String productList(Model model) {
		model.addAttribute("prduct", productRepository.findAll());
		return "product";
	}
	
	@RequestMapping(value = "/product/save", method = RequestMethod.POST)
	@ResponseBody
	public String saveProduct(@RequestBody Product product) {
		productRepository.save(product);
		return product.getProductId().toString();
		
	}
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteProduct(@PathVariable Long id) {
		productRepository.deleteById(id);
		return id.toString();
		
	}

}
