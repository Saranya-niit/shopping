package com.niit.SaranyaBoutiqueBackend.services;
import java.util.List;

import com.niit.SaranyaBoutiqueBackend.dao.ProductDaoImpl;
import com.niit.SaranyaBoutiqueBackend.model.Product;


public class ProductServices {
ProductDaoImpl productDao=new ProductDaoImpl();

public List<Product>getAllProduct()
{
	return productDao.getAllProduct();

}
public Product getById(int id)
{
	return productDao.getById(id);
}
}
