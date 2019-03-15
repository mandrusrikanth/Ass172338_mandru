package com.core.spr;

import com.core.Address;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
public void getCustomer() {
		
		System.out.println("customerId:" +getCustomerId());
		System.out.println("customerName:" +getCustomerName());
		System.out.println("customerContact:" +getCustomerContact());
		System.out.println("customerAddress:" +getCustomerAddress().getStreet() +getCustomerAddress().getCity() +getCustomerAddress().getState() +getCustomerAddress().getZip() +getCustomerAddress().getCountry());
		
	}
	 
	
}
