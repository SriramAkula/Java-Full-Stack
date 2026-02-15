package com.capg.layers;

import java.io.Serializable;

public class ProductBean implements Serializable{
	
	private int pid;
	private String pname;
	private double price;
	private int discountable;
	
	public ProductBean() {
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscountable() {
		return discountable;
	}

	public void setDiscountable(int discountable) {
		this.discountable = discountable;
	}
	
	
	
}
