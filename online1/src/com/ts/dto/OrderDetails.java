package com.ts.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="OrderDetail")

public class OrderDetails implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name="orderId")
	
	private Order order;
	
	@ManyToOne
	@JoinColumn(name="itemId")
		private Items items;
	
	@Column(length=25)
	private int quantity;
	public OrderDetails(Order order, Items items, int quantity) {
		super();
		this.order = order;
		this.items = items;
		this.quantity = quantity;
	}
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	public Items getItems() {
		return items;
	}



	public void setItems(Items items) {
		this.items = items;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderDetails [order=" + order + ", items=" + items + ", quantity=" + quantity + "]";
	}
	
	

}
