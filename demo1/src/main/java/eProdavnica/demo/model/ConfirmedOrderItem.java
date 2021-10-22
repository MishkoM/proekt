package eProdavnica.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ConfirmedOrderItem {

	@Id
	@GeneratedValue
	private int confirmedOrderItemId;
	
	private int Quantity;
	private double totalPrice;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "confirmedOrderId")
	private ConfirmedOrder confirmedOrder;

	public int getConfirmedOrderItemId() {
		return confirmedOrderItemId;
	}

	public void setConfirmedOrderItemId(int confirmedOrderItemId) {
		this.confirmedOrderItemId = confirmedOrderItemId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ConfirmedOrder getConfirmedOrder() {
		return confirmedOrder;
	}

	public void setConfirmedOrder(ConfirmedOrder confirmedOrder) {
		this.confirmedOrder = confirmedOrder;
	}
	
	
	
	
}

