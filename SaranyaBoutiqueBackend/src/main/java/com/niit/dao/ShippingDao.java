package com.niit.dao;
import java.security.Principal; 
import com.niit.model.ShippingAddress; 
 
 
 public interface ShippingDao { 
 
 
	void addShippingAddress(ShippingAddress add, Principal p); 
 } 




