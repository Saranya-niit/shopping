package com.niit.model;
import java.io.Serializable; 

 
import javax.persistence.Column; 
 import javax.persistence.Entity; 
 import javax.persistence.FetchType; 
 import javax.persistence.GeneratedValue; 
 import javax.persistence.GenerationType; 
 import javax.persistence.Id; 
 import javax.persistence.JoinColumn; 
 import javax.persistence.OneToOne; 
 import javax.persistence.SequenceGenerator; 
 import javax.persistence.Table; 
 
 
 @Entity 
@Table(name="ORDERS") 
 public class Order implements Serializable { 
    
 	@Id 
 	@Column(name="ORDERID") 
 	@SequenceGenerator(name="order_seq",sequenceName="order_seq") 
 	@GeneratedValue(strategy=GenerationType.AUTO,generator="order_seq") 
 	private int oId; 
 	@OneToOne(fetch = FetchType.EAGER) 
     @JoinColumn(name = "userId") 
 	private Customer userdetails;      
 	@OneToOne(fetch = FetchType.EAGER) 
     @JoinColumn(name = "cartId") 
 	private Cart cart; 
 
  public Customer getUserdetails() { 
 	return userdetails; 
 } 
 
  public void setUserdetails(Customer userdetails) { 
 	this.userdetails = userdetails; 
 } 
 public Cart getCart() { 
 	return cart; 
 } 
 
  public void setCart(Cart cart) { 
	this.cart = cart; 
 } 
 
  private Customer customer;  
 
  public Customer getCustomer() { 
 	return customer; 
 } 
 
 
 public void setCustomer(Customer customer) { 
 	this.customer = customer; 
 } 
 
 
 public int getoId() { 
 	return oId; 
 } 
 
 
 public void setoId(int oId) { 
 	this.oId = oId; 
 } 
    
    
    
 } 
