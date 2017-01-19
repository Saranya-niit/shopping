package com.niit.dao;

import java.util.List; 
import com.niit.model.Cart; 
 import com.niit.model.Item; 
 
 
 public interface ItemDao { 
 	void addItem(Item i); 
 	void editItem(Item i); 
 	void deleteItem(Item i); 
     public List<Item>listitem(int itemId); 
 	public void removeAllCartItems(Cart cart); 
 	public Item getCartItemByItemId(int itemId); 
 
 
 } 

