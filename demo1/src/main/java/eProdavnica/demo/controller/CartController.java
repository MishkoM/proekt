/*
 * package eProdavnica.demo.controller;
 * 
 * 
 * import java.util.List;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import eProdavnica.demo.model.Cart; import eProdavnica.demo.model.CartItem;
 * import eProdavnica.demo.model.Customer; import
 * eProdavnica.demo.model.Product; import
 * eProdavnica.demo.repository.CartItemRepository; import
 * eProdavnica.demo.repository.CartRepository; import
 * eProdavnica.demo.repository.CustomerRepository; import
 * eProdavnica.demo.repository.ProductRepository;
 * 
 * 
 * @RestController public class CartController {
 * 
 * @Autowired ProductRepository productRepository;
 * 
 * @Autowired CustomerRepository customerRepository;
 * 
 * @Autowired CartRepository cartRepository;
 * 
 * @Autowired CartItemRepository cartItemRepository;
 * 
 * @RequestMapping("/cart/{id}") public String product(@PathVariable int id,
 * Model model) { model.addAttribute("cart", cartRepository.findById(id));
 * return "cart"; }
 * 
 * @RequestMapping(value = "/add/{productId}", method = RequestMethod.POST)
 * public void addItem(@RequestParam String customerName ,@RequestParam(value =
 * "productId") long productId, Model model) { Customer customer = new
 * Customer(); customer.setCustomerName(customerName);
 * customerRepository.save(customer);
 * 
 * Cart cart = new Cart(); cart.setCustomer(customerRepository.findById((long)
 * customer.getCustomerId())); model.addAttribute("product",
 * productRepository.findById(productId)); List<CartItem> cartItems =
 * cart.getCartItem();
 * 
 * for(int i=0; i < cartItems.size(); i++) { if(productId ==
 * cartItems.get(i).getProduct().getProductId()) { CartItem cartItem =
 * cartItems.get(i); cartItem.setQuantity(cartItem.getQuantity() + 1);
 * cartItem.setTotalPrice(Product.getPrice() * cartItem.getQuantity());
 * cartItemRepository.save(cartItem); return; } }
 * 
 * }
 * 
 * @RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE) public
 * void clearCart(@PathVariable int cartId) { cartRepository.deleteAll(); }
 * 
 * @RequestMapping(value = "/remove/{productId}", method = RequestMethod.PUT)
 * public String removeItem(@PathVariable Long productId) {
 * cartItemRepository.delete(productId); return productId.toString();
 * 
 * }
 * 
 * }
 */