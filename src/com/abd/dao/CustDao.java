package com.abd.dao;

import java.util.List;

import com.abd.entity.Customer;

public interface CustDao {

	public List<Customer> getcustlist();

	public  void saveCustomer(Customer thecustomer);

	

	public Customer getcustomer(int theid);

	public void deleteCustomer(int theid);

	
	
	
}
