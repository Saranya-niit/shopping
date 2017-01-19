package com.niit.dao;
import java.util.List; 
 
import com.niit.model.Customer; 
import com.niit.model.User;  
  public interface CustomerDao { 
	void addcustomer(User u); 
 	public Customer getCustomerById(int id); 
 	 public List<Customer> getAllUsers(); 
 	 public Customer getUserByUsername (String username); 
 	  
 
 
} 




