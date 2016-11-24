package com.niit.dao;
import java.util.LinkedList;
import java.util.List;
import com.niit.model.*;
public class ProductDaoImpl implements Productdao{
	public static List<Product> prdlist= new LinkedList<Product>();
	
   public  ProductDaoImpl() {
	prdlist.add(new Product(101,"kurtha",450,10,"cute dress","im10.jpg"));
	prdlist.add(new Product(102,"Nylon Mix Color Dress",1450,2,"cute dress","im12.jpg"));
	prdlist.add(new Product(103,"chudithar",2500,6,"nice dress","im21.jpg"));
	prdlist.add(new Product(104,"salvar",1500,4,"party wear","im22.jpg"));
	prdlist.add(new Product(105,"anarkali",2000,4," weading wear","im19.jpg"));
	prdlist.add(new Product(106,"lehenga",3000,3,"party wear","im16.jpg"));
	prdlist.add(new Product(107,"gown",4000,2,"party wear","im15.jpg"));
	prdlist.add(new Product(108,"gown",4500,3,"net gown","im20.jpg"));
     }
public List<Product>getAllProduct()
{
	return prdlist;
}

public Product getById(int id)
{
	for(Product prd :prdlist)
		if(prd.getPid()==id)
			return prd;
	return null;
}
}

