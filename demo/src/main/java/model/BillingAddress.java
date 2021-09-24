package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress {

	@Id
	@GeneratedValue
	private int billingAddressId;
	
	private String Number;
	private String streetName;
	private String City;
	private String Country;
	private String postCode;
	
	@OneToOne
	private Customer customer;
	
	@OneToOne
	private ConfirmedOrder confirmedOrder;

	public int getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
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

	public Customer getCostomer() {
		return customer;
	}

	public void setCostomer(Customer costomer) {
		this.customer = costomer;
	}

	public ConfirmedOrder getConfirmedOrder() {
		return confirmedOrder;
	}

	public void setConfirmedOrder(ConfirmedOrder confirmedOrder) {
		this.confirmedOrder = confirmedOrder;
	}

	@Override
	public String toString() {
		return "BillingAddress [Number=" + Number + ", streetName=" + streetName + ", City=" + City + ", Country="
				+ Country + ", postCode=" + postCode + "]";
	}
	
	
	
	
}
