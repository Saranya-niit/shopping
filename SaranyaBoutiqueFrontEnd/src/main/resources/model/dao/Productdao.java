package com.niit.SaranyaBoutiqueBackend.dao;

import java.util.List;

import com.niit.SaranyaBoutiqueBackend.model.Product;


public interface Productdao {
	public List<Product>getAllProduct();
	
	public Product getById(int id); 
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public void removeProduct(Product p);
}
