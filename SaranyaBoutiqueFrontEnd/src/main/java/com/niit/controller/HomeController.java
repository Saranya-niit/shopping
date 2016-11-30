package com.niit.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niit.SaranyaBoutiqueBackend.model.Product;
import com.niit.SaranyaBoutiqueBackend.services.ProductServices;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String home()
	{
		return"index";
	}
	@RequestMapping(value="/contactus")
	public String contactus()
	{
		return"contactus";
		
	}
	@RequestMapping(value="/aboutus")
	public String aboutus()
	{
		return"aboutus";
	}
   @RequestMapping(value="/registration")
   public String registration()
   {
	   return"registration"; 
   }
   @RequestMapping(value="/viewall")
	public String viewall()
	{
		return"viewall";
	}
   ProductServices productservices=new ProductServices();
	@RequestMapping(value="/products")
	public @ResponseBody List<Product> getAllData()
	{
		List<Product> productList=productservices.getAllProduct();
		
		return productList;
	}
	@RequestMapping(value="/disp")
	public ModelAndView display(@RequestParam(name="id") String prdid){
		int pid =Integer.parseInt(prdid);
		Product p=productservices.getById(pid);
		ModelAndView mv=new ModelAndView("displayProduct","product",p);
		return mv;
	}

}
