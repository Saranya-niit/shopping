package com.niit.services;
import java.util.List; 

 
 import org.springframework.beans.factory.annotation.Autowired; 
 import org.springframework.stereotype.Service; 
 
 
 import com.niit.dao.ItemDao; 
 import com.niit.dao.ItemDaoImpl; 
 import com.niit.model.Cart; 
 import com.niit.model.Item; 
 
 @Service 
 public class CartItemService { 
	   @Autowired 
	    private ItemDao cartItemDao; 

 
    public void addCartItem(Item cartItem) { 
        cartItemDao.addItem(cartItem); 
    } 

 
   public void removeCartItem(Item cartItem) { 
       cartItemDao.deleteItem(cartItem); 
    } 	    public void removeAllCartItems(Cart cart){ 
 	        cartItemDao.removeAllCartItems(cart); 
 	    } 
	    public Item getCartItemByItemId (int itemId) { 
 	        return cartItemDao.getCartItemByItemId(itemId); 
	    } 
 	    

 
 } 


