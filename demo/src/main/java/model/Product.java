package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long productId;
	
	private String Name;
	private String Category;
	private Double Price;
	private String Status;
	private int unitInStock;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CartItem> cartItemList;
	
	@OneToMany(mappedBy = "product" , cascade = CascadeType.ALL)
	private List<ConfirmedOrderItem> confirmedOrderItemList;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public List<CartItem> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItem> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public List<ConfirmedOrderItem> getConfirmedOrderItemList() {
		return confirmedOrderItemList;
	}

	public void setConfirmedOrderItemList(List<ConfirmedOrderItem> confirmedOrderItemList) {
		this.confirmedOrderItemList = confirmedOrderItemList;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", Name=" + Name + ", Category=" + Category + ", Price=" + Price
				+ ", Status=" + Status + ", unitInStock=" + unitInStock + ", cartItemList=" + cartItemList
				+ ", confirmedOrderItemList=" + confirmedOrderItemList + "]";
	}
	
	
	
}
