package com.niit.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.services.ProductServices;
@Controller
public class ProductController {
	ProductServices productservices=new ProductServices();
	
	
	
	@RequestMapping(value="/products")
	public @ResponseBody List<Product> getAllData()
	{
		List<Product> productList=productservices.getAllProduct();
		
		return productList;
	}
	

}
