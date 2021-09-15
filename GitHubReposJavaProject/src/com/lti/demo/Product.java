package com.lti.demo;

public class Product {

	private int prdId;
	private String prdname;
	private double cost;
	public Product(int prdId, String prdname, double cost) {
		super();
		this.prdId = prdId;
		this.prdname = prdname;
		this.cost = cost;
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdname() {
		return prdname;
	}
	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdname=" + prdname + ", cost=" + cost + "]";
	}
	
}
