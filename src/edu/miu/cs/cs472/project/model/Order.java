package edu.miu.cs.cs472.project.model;

import java.util.List;

public class Order {
	private int id;
	private List<Item> items;
	private double sum;
	private BillingDetails billingDetails;
	
	public Order(int i, List<Item> il, double s, BillingDetails bd) {
		this.id = i;
		this.items = il;
		this.sum = s;
		this.billingDetails = bd;
		 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public BillingDetails getBillingDetails() {
		return billingDetails;
	}

	public void setBillingDetails(BillingDetails billingDetails) {
		this.billingDetails = billingDetails;
	}
	
		
}
