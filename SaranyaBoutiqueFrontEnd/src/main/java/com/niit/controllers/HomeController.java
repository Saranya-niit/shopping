package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niit.models.Product;
import com.niit.models.User;
import com.niit.services.ProductServices;

@Controller
public class HomeController {
	@Autowired
	 ProductServices productservices;
	@RequestMapping(value={"/","/SaranyaBoutiqueFrontEnd/"})
	public String home()
	{
		return "index";
	}

	@RequestMapping(value="/contact_us")
	public String contact_us()
	{
		return "Contact_us";
	}
	@RequestMapping(value="/About_us")
	public String About_us()
	{
		return "About_Us";
	}
	
		@RequestMapping(value="/view_All")
	public String View_All()
	{
		return "View_All";
	}
	
	 @RequestMapping (value={"/product", "/admin/product"})
		
		public @ResponseBody List<Product> getAllData()
		{
			List<Product> productList= productservices.getAllProduct();
			
			return productList;
		}
	 
	  
	  @RequestMapping(value="/disp")
	  public ModelAndView display(@RequestParam(name="id") String prdid){
		  int pid =Integer.parseInt(prdid);
		  Product p =productservices.getById(pid);
		  ModelAndView mv = new ModelAndView("displayProduct","product",p);
		  return mv;
		  
	  }

	}