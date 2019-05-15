package com.ts.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Payment {
	@OneToOne
	@JoinColumn(name="custId")
	private Customer customer;
	@Column(length=25)
	private long accno;
	@Column(length=25)
	private double amount;
	
	

	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public long getAccno() {
		return accno;
	}



	public void setAccno(long accno) {
		this.accno = accno;
	}



	public double getAmount() {
		return amount;
	}



	public Payment(Customer customer, long accno, double amount) {
		super();
		this.customer = customer;
		this.accno = accno;
		this.amount = amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public Payment() {
	}

}
