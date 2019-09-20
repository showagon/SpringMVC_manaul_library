package com.abd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abd.dao.CustDao;
import com.abd.entity.Customer;

@Service
public class CustServicesImpl implements CustServices {

	@Autowired
	private CustDao custdao;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {

		
		
		
		return custdao.getcustlist();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer thecustomer) {

		custdao.saveCustomer(thecustomer);
		
	}

	
	
	
	@Override
	@Transactional
	public Customer getcustomer(int theid) {
		return custdao.getcustomer(theid);
		
	}
	
	@Override
	@Transactional
	public void deleteCustomer(int theid) {
		custdao.deleteCustomer(theid);
	}
	
	
	
	
	
}
