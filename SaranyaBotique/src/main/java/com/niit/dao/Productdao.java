package com.niit.dao;
import com.niit.model.*;
import java.util.List;


public interface Productdao {
	public List<Product>getAllProduct();
	public Product getById(int id); 
}
