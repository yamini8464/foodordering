package com.ts.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	public Customer(int custId, String custName, String userId, String password, String phno, String dno,
			String street) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.userId = userId;
		this.password = password;
		this.phno = phno;
		this.dno = dno;
		this.street = street;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	@Column(length=25)
	private String custName;
	@Column(length=25)
	private String userId;
	@Column(length=25)
	private String  password;
	@Column(length=25)
	private String phno;
	@Column(length=25)
	private String dno;
	@Column(length=25)
	private String street;
	public Customer()
	{
		super();
	}
	public Customer(String custName, String userId, String phno, String password, String doorno, String street) {
		super();
		this.custName = custName;
		this.userId = userId;
		this.password = password;
		this.phno = phno;
		this.dno = doorno;
		this.street = street;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getDno() {
		return dno;
	}

	public void setDno(String doorno) {
		this.dno = doorno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
}
