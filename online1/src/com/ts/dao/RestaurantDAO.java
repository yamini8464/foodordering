package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Restaurant;

public class RestaurantDAO {
private SessionFactory factory = null;

	public List<Restaurant> getAllRestaurants() {
		List<Restaurant> rest=(List)HibernateTemplate.getObjectListByQuery("From Restaurant");
		System.out.println("Inside All Depts ..."+rest);
		return rest;	
	}
	public Restaurant getRestaurant(int id) {
		return (Restaurant)HibernateTemplate.getObject(Restaurant.class,id);
	}

}
