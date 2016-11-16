package com.niit.model;

public class Product {
	private int pid;
	private String pname;
	private double price;
	private int quantity;
	private String desc;
	private String name;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}public Product()
	{
		
	}
	
	public Product(int pid,String pname,double price,int quantity,
			String desc,String name)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
		this.quantity=quantity;
		this.desc=desc;
		this.name=name;
	}
}
