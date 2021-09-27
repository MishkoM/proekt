package eProdavnica.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ShippingAddress {

	@Id
	@GeneratedValue
	private int shippingAddressId;
	
	private String Number;
	private String streetName;
	private String City;
	private String Country;
	private String postCode;
	
	@OneToOne
	private Customer customer;
	
	@OneToOne
	private ConfirmedOrder confirmedOrder;

	public int getShippingAddressId() {
		return shippingAddressId;
	}

	public void setShippingAddressId(int shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ConfirmedOrder getConfirmedOrder() {
		return confirmedOrder;
	}

	public void setConfirmedOrder(ConfirmedOrder confirmedOrder) {
		this.confirmedOrder = confirmedOrder;
	}

	@Override
	public String toString() {
		return "ShippingAddress [Number=" + Number + ", streetName=" + streetName + ", City=" + City + ", Country="
				+ Country + ", postCode=" + postCode + "]";
	}
	
	
	
}

