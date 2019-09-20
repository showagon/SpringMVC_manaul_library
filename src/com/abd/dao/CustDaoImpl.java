package com.abd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abd.entity.Customer;

@Repository
public class CustDaoImpl implements CustDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getcustlist() {
		
		
		Session cursession = sessionFactory.getCurrentSession();
		
		Query<Customer> thequery = cursession.createQuery("from Customer order by firstName",Customer.class);
		List<Customer> customer = thequery.getResultList();
		
		
		
		return customer;
	}

	@Override
	public void saveCustomer(Customer thecustomer) {

		Session cursession = sessionFactory.getCurrentSession();
		
		cursession.saveOrUpdate(thecustomer);
		
		
	}

	

	@Override
	public Customer getcustomer(int theid) {
		Session cursession = sessionFactory.getCurrentSession();
		
		Customer customer = cursession.get(Customer.class, theid);
		
		
		return customer;
		
	}

	@Override
	public void deleteCustomer(int theid) {

		Session cursession = sessionFactory.getCurrentSession();
		
		Query thequery = cursession.createQuery("delete from Customer where id=:custid");
		thequery.setParameter("custid", theid);
		thequery.executeUpdate();
		
	}
	

	

}
