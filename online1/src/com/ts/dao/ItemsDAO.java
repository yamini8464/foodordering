package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Items;
import com.ts.dto.Restaurant;

public class ItemsDAO {
	private SessionFactory factory = null;
	public List<Items> getItemsByRestId(int restId) {
		//System.out.println(""+n);
		List<Items> items=(List)HibernateTemplate.getItemsListByQuery(restId);
		System.out.println("Inside All Items ..."+items);
		return items;	
	}

}
