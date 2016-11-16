package com.niit.dao;
import java.util.LinkedList;
import java.util.List;
import com.niit.model.*;
public class ProductDaoImpl implements Productdao{
	public static List<Product> prdlist= new LinkedList<Product>();
	
   public  ProductDaoImpl() {
	prdlist.add(new Product(101,"birthday dress",450,10,"cute dress","im10.jpg"));
	prdlist.add(new Product(102,"Nylon Mix Color Dress",1450,2,"cute dress","im7.jpg"));
     }
public List<Product>getAllProduct()
{
	return prdlist;
}
}
