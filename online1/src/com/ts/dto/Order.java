package com.ts.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.persistence.TemporalType;
@Entity
@Table(name="Orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@ManyToOne
	@JoinColumn(name="custId")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="restId")
	private Restaurant restaurant;
	
	@Temporal(TemporalType.DATE)
	@Column(length=25)
	private Date date;
	
	@Column(length=25)
	private String orderDno;
	
	@Column(length=25)
	private String orderStreet;
	
	public Order(){	
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getOrderDno() {
		return orderDno;
	}
	public void setOrderDno(String orderDno) {
		this.orderDno = orderDno;
	}
	public String getOrderStreet() {
		return orderStreet;
	}
	public void setOrderStreet(String orderStreet) {
		this.orderStreet = orderStreet;
	}
	public Order(int orderId,Customer customer, Restaurant restaurant, Date date, String orderDno,
			String orderStreet) {
		super();
		this.orderId=orderId;
		this.customer = customer;
		this.restaurant = restaurant;
		this.date = date;
		this.orderDno = orderDno;
		this.orderStreet = orderStreet;
	}
	public Order(Customer customer, Restaurant restaurant, Date date, String orderDno,
			String orderStreet) {
		super();
		this.customer = customer;
		this.restaurant = restaurant;
		this.date = date;
		this.orderDno = orderDno;
		this.orderStreet = orderStreet;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", restaurant=" + restaurant + ", date=" + date
				+ ", orderDno=" + orderDno + ", orderStreet=" + orderStreet + "]";
	}
	
	
	}
