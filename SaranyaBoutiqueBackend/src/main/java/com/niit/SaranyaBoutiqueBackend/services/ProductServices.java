package com.niit.SaranyaBoutiqueBackend.services;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.niit.SaranyaBoutiqueBackend.dao.ProductDAO;
import com.niit.SaranyaBoutiqueBackend.dao.ProductDaoImpl;
import com.niit.SaranyaBoutiqueBackend.model.Product;

@Service
public class ProductServices {
	@Autowired
	ProductDAOImpl productdao=new ProductDaoImpl;

    public List<Product>getAllProduct()
    {
	return productDao.getAllProduct();

     }
public Product getById(int id)
{
	return productDao.getById(id);
}
public void addProduct(Product p) {
	
	productDao.addProduct(p);
	
}
public void updateProduct(Product p) {
	productDao.updateProduct(p);

}
public void removeProduct(int id) {
	productDao.removeProduct(id);
}
public void storeFile(Product p, HttpServletRequest request)
{
	productDao.storeFile(p,request);
}
public void removeProduct(Product p);
}
