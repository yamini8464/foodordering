package com.ts.dao;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Customer;
import com.ts.dto.Order;

public class OrderDAO {
	public int register(Order order) {
		return HibernateTemplate.addObject(order);
	}
	
	public int update(Order order){
		return HibernateTemplate.updateObject(order);
	}
	public OrderDAO() {
		// TODO Auto-generated constructor stub
	}

}
