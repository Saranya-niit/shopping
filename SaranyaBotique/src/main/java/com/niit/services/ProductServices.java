package com.niit.services;
import java.util.List;
import com.niit.dao.ProductDaoImpl;
import com.niit.model.Product;

public class ProductServices {
ProductDaoImpl productDao=new ProductDaoImpl();

public List<Product>getAllProduct()
{
	return productDao.getAllProduct();

}
}
