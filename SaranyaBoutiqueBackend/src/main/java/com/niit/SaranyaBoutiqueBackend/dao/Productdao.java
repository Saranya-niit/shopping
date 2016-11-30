package com.niit.SaranyaBoutiqueBackend.dao;

import java.util.List;

import com.niit.SaranyaBoutiqueBackend.model.Product;


public interface Productdao {
	public List<Product>getAllProduct();
	public Product getById(int id); 
}
