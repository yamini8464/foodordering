package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Customer;

public class CustomerDAO {
private SessionFactory factory = null;
	
	public Customer getCustomer(String user) {
		return (Customer)HibernateTemplate.getObjectByUserName(user);
	}

	public int register(Customer customer) {
		return HibernateTemplate.addObject(customer);
	}
	public int update(Customer customer){
		return HibernateTemplate.updateObject(customer);
	}
	public int delete(int empId){
		return HibernateTemplate.deleteObject(Customer.class,empId);
	}


	/*public List<Customer> getAllEmployees() {
		List<Customer> customers=(List)HibernateTemplate.getObjectListByQuery("From Customer");
		System.out.println("Inside All Customers ..."+customers);
		return customers;	
	}

	public Customer getEmployee(int id) {
		return (Customer)HibernateTemplate.getObject(Customer.class,id);
	}*/


}
