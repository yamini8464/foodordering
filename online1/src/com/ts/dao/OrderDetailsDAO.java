package com.ts.dao;

import java.util.List;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Customer;
import com.ts.dto.Items;
import com.ts.dto.OrderDetails;



public class OrderDetailsDAO {
	public List<Integer> getOrderDetailsByorderId(int orderId) {
		//System.out.println(""+n);
		List <Integer> items=(List)HibernateTemplate.getOrdersListByQuery(orderId);
		System.out.println("Inside All Items ..."+items);
		return items;	
	}
	public int register(OrderDetails orderDetails) {
		return HibernateTemplate.addObject(orderDetails);
	}
	

	public OrderDetailsDAO() {
	}
	public int update(OrderDetails orderDetails) {
		return HibernateTemplate.updateObject(orderDetails);

	}
		
}
