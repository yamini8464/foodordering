package com.ts.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity

public class Items {
	
	public Items() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int itemId;
	@ManyToOne
	@JoinColumn(name="restId")
	private Restaurant rest;
	@Column(length=25)
	private String itemName;
	@Column(length=25)
	private String itemImage;
	public Items(int itemId, Restaurant rest, String itemName, int price, String itemImage) {
		super();
		this.itemId = itemId;
		this.rest = rest;
		this.itemName = itemName;
		this.price = price;
		this.itemImage = itemImage;
	}
	@Column(length=25)
	private int price;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Restaurant getRest() {
		return rest;
	}
	public void setRest(Restaurant rest) {
		this.rest = rest;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", rest=" + rest + ", itemName=" + itemName + ", price=" + price
				+ ", itemImage=" + itemImage + "]";
	}
	
}

