package com.niit.controller;

 

 import java.security.Principal; 

 import java.util.List; 
 

 import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus; 
import org.springframework.web.bind.annotation.ExceptionHandler; 
import org.springframework.web.bind.annotation.PathVariable; 
 import org.springframework.web.bind.annotation.RequestMapping; 
 import org.springframework.web.bind.annotation.RequestMethod; 
 import org.springframework.web.bind.annotation.ResponseStatus; 
 import org.springframework.web.bind.annotation.RestController; 
 

 import com.niit.model.Cart; 
 import com.niit.model.Customer; 
 import com.niit.model.Item; 
 import com.niit.model.Product; 
 import com.niit.services.CartItemService; 
 import com.niit.services.Customer_Service; 
 import com.niit.services.ProductServices; 
 
 @RestController 
 
 public class CartController { 
 	 
 
     @Autowired 
     private CartItemService cartItemService; 
 
    @Autowired 
     private Customer_Service usersDetailService; 
 

     @Autowired 
     private ProductServices itemService; 
     @RequestMapping("/refreshCart") 
     public Cart getCartById (Principal principal) { 
     	System.out.println("refreshing cart"); 
     	Customer usersDetail = usersDetailService.getUserByUsername(principal.getName()); 
     	System.out.println("cart id:"+ usersDetail.getCustName()+" "+usersDetail.getCart().getCartId()); 
         Cart cart = usersDetail.getCart(); 
         return cart; 
     } 
 
 
     @RequestMapping(value = "addItem/{itemId}", method = RequestMethod.PUT) 
    @ResponseStatus(value = HttpStatus.NO_CONTENT) 
     public void addItem (@PathVariable("itemId") int itemId, Principal principal) { 
 
 
     	System.out.println("add"); 
     	 
     	Customer usersDetail = usersDetailService.getUserByUsername(principal.getName()); 
     	System.out.println("cust name:"+ usersDetail.getCustName()); 
         Cart cart = usersDetail.getCart(); 
         System.out.println("cart id:"+ cart.getCartId()); 
         Product item = itemService.getById(itemId); 
         System.out.println("Product:"+ item.getPname()); 
         List<Item> cartItems = cart.getItem(); 
         System.out.println("cart item size:"+ cartItems.size()); 
         for (int i=0; i<cartItems.size(); i++) { 
             if(item.getPid()==cartItems.get(i).getProduct().getPid()){ 
                 Item cartItem = cartItems.get(i); 
                 cartItemService.removeCartItem(cartItem); 
                 cartItem.setQunitity(cartItem.getQunitity()+1); 
               cartItem.setTotalPrice(item.getPrice()*cartItem.getQunitity());                 
                 cartItemService.addCartItem(cartItem); 
 
 
                 return; 
             } 
         } 
 
 
         Item cartItem = new Item(); 
         cartItem.setProduct(item); 
         cartItem.setQunitity(1); 
         cartItem.setTotalPrice(item.getPrice()*cartItem.getQunitity()); 
         cartItem.setCart(cart); 
         cartItemService.addCartItem(cartItem); 
    } 
     /* 
      * removeItem method is used to remove a item from user cart. 
      */ 
     @RequestMapping(value = "/removeItem/{itemId}", method = RequestMethod.PUT) 
     @ResponseStatus(value = HttpStatus.NO_CONTENT) 
     public void removeItem (@PathVariable("itemId") int itemId) { 
     	System.out.println("Deleting item Id: "+itemId); 
         Item cartItem =cartItemService.getCartItemByItemId(itemId); 
         System.out.println(cartItem.getProduct().getPname()); 
         cartItemService.removeCartItem(cartItem); 
 
 
     } 
      
     
    /* 
      * clearCartItems method is used to remove all items from user cart. 
      */ 
     @RequestMapping(value = "/clearCartItems", method = RequestMethod.DELETE) 
     @ResponseStatus(value = HttpStatus.NO_CONTENT) 
     public void clearCartItems(Principal principal) { 
     	 
   	Customer usersDetail = usersDetailService.getUserByUsername(principal.getName()); 
     	System.out.println("cart id:"+ usersDetail.getCustName()); 
         Cart cart = usersDetail.getCart(); 
          
         cartItemService.removeAllCartItems(cart); 
     } 
     /* 
      * ExceptionHandler for client errors. 
      */ 
     @ExceptionHandler(IllegalArgumentException.class) 
     @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, please verify your payload.") 
     public void handleClientErrors (Exception e) {} 
     /* 
      * ExceptionHandler for server errors. 
      */ 
     @ExceptionHandler(Exception.class) 
     @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error.") 
     public void handleServerErrors (Exception e) {} 
 
 
 }




