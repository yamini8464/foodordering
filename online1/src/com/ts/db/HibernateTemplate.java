package com.ts.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ts.dto.Customer;
import com.ts.dto.Items;
import com.ts.dto.OrderDetails;

public class HibernateTemplate {

	private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	public static int addObject(Object obj)
	{
		int result=0;
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.save(obj);
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static Object getObject(Class c,Serializable serializable)
	{
		Object obj=null;
		
		try {			
			return sessionFactory.openSession().get(c,serializable);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return obj;
	}
	public static List<Items> getItemsListByQuery(int restId)
	{
		String hql = "from Items where restId = :restId";
		Query query = sessionFactory.openSession().createQuery(hql);
		query.setInteger("restId",restId);
		List <Items>results = query.list();
		return results;
	}
	public static List<Integer> getOrdersListByQuery(int orderId)
	{
		String hql = "select items.itemId from OrderDetails where orderId = :orderId";
		Query query = sessionFactory.openSession().createQuery(hql);
		query.setInteger("orderId",orderId);
		List <Integer> results = query.list();
		return results;
	}
	
	public static Object getObjectByUserName(String userId) {
	String queryString = "from Customer where userId = :userId";
	  Query query = sessionFactory.openSession().createQuery(queryString);
	  query.setString("userId", userId);
	  Object queryResult = query.uniqueResult();
	  Customer customer = (Customer)queryResult;
	  //System.out.println(customer.getUserId()+" "+customer.getPassword()); 
	  return customer; 
	}
	
	public static List<Object> getObjectListByQuery(String query)
	{
		return sessionFactory.openSession().createQuery(query).list();
	}
	
	public static int updateObject(Object obj)
	{
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			//session.saveOrUpdate(obj);
			session.merge(obj);
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static int deleteObject(Class c,Serializable serializable)
	{
		int result=0;
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		try {
			
			Object obj=session.get(c,serializable);
			
			session.delete(obj);
			
			tx.commit();
			
			result=1;
						
		} catch (Exception e) {
			
			e.printStackTrace();
			
			tx.rollback();
		}
		
		return result;
	}
}
