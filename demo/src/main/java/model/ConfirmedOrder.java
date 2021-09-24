package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ConfirmedOrder {

	@Id
	@GeneratedValue
	private int confirmedOrderId;
	
	private double grandTotal;
	
	@OneToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name = "billingAddressId")
	private BillingAddress billingAddress;
	
	@OneToOne
	@JoinColumn(name = "shippingAddressId")
	private ShippingAddress shippingAddress;
	
	@OneToMany(mappedBy = "confirmedOrder", cascade = CascadeType.ALL)
	private List<ConfirmedOrderItem> orderItem;

	public int getConfirmedOrderId() {
		return confirmedOrderId;
	}

	public void setConfirmedOrderId(int confirmedOrderId) {
		this.confirmedOrderId = confirmedOrderId;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public List<ConfirmedOrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<ConfirmedOrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	
	
}
