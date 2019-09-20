package com.abd.services;

import java.util.List;

import com.abd.entity.Customer;

public interface CustServices {

	public List<Customer> getCustomer();

	public void saveCustomer(Customer thecustomer);

	public Customer getcustomer(int theid);

	public void deleteCustomer(int theid);

	
	
	
	
}
