package com.niit.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="CART")
public class Cart implements Serializable {

  @Id
  @SequenceGenerator(name="cart_seq", sequenceName="cart_seq")
  @GeneratedValue(strategy=GenerationType.AUTO,generator="cart_seq")
  private int cartId;
  public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}

@Column(name="ListOfItem")
@OneToMany(mappedBy="cart",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private List<Item> item;
public List<Item> getItem() {
	return item;
}
public void setItem(List<Item> item) {
	this.item = item;
}

@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "custId")
@JsonIgnore
private Customer userDetails; //has relationship with Customer class
public Customer getUserDetails() {
	return userDetails;
}
public void setUserDetails(Customer userDetails) {
	this.userDetails = userDetails;
}

private double grandTotal;
public double getGrandTotal() {
	return grandTotal;
}
public void setGrandTotal(double grandTotal) {
	this.grandTotal = grandTotal;
}
}
