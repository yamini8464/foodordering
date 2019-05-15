package com.ts.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Restaurant")
public class Restaurant {
	@Id
	@GeneratedValue
	@Column(length=25)
	private int restId;
	@Column(length=25)
	private String restName;
	@Column(length=25)
	private String restLocation;
	@Column(length=25)
	private String restImage;
	public Restaurant(){
		
	}
	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public String getRestLocation() {
		return restLocation;
	}

	public void setRestLocation(String restLocation) {
		this.restLocation = restLocation;
	}

	public String getRestImage() {
		return restImage;
	}

	public void setRestImage(String restImage) {
		this.restImage = restImage;
	}

	public Restaurant(int restId, String restName, String restLocation, String restImage) {
		super();
		this.restId = restId;
		this.restName = restName;
		this.restLocation = restLocation;
		this.restImage = restImage;
	}
	@Override
	public String toString() {
		return "Restaurant [restId=" + restId + ", restName=" + restName + ", restLocation=" + restLocation
				+ ", restImage=" + restImage + "]";
	}	
		
}
