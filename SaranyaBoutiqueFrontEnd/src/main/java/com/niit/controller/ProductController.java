package com.niit.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.services.ProductServices;

@Controller
public class ProductController {
	@Autowired
    private	ProductServices services;

	


	@RequestMapping(value = "/admin/add", method = RequestMethod.GET) 
	 	public ModelAndView addProduct() 
	 	{
			Product p = new Product();
			p.setPname("red");
			p.setCategory("Casual Dress");
		return new ModelAndView("admin/addProduct","product",p);
	 	}
     @RequestMapping(value = "/admin/add", method = RequestMethod.POST) 
	    public ModelAndView AddActionPage(
	   @ModelAttribute("product") @Validated Product p,  
 			BindingResult result, Model m,HttpServletRequest request) { 
 		System.out.println("adding..."+p); 
 		System.out.println( p.getCategory());//+"  "+p.getPrice()+"  "+p.getImage()+"  "+p.getDesc()+"  "+p.getFile().getName());
 		if (result.hasErrors())
 		{
 			System.out.println("Err:"+result.getAllErrors());
 			return new ModelAndView("admin/addProduct","product",p); 
 	    } else { 
 						p.setImage(p.getFile().getOriginalFilename()); 
 			 			services.storeFile(p, request); 
 					services.addProduct(p);
 					return new ModelAndView("admin/addProduct","msg","Product Added Sucessfully");	
 		}
     }@RequestMapping(value = "/admin/delete", method = RequestMethod.GET) 
      	public String DeletePage() { 
    	  		return "/admin/deleteProduct"; 
    	  	} 
    	  
    	  
    	  	@RequestMapping(value = "/admin/delete", method = RequestMethod.POST) 
    	  	public ModelAndView DeleteActionPage(@RequestParam("id") int id) {
    	  		System.out.println("ID recieved for deletion: "+ id);
    	  		services.removeProduct(id); 
    	  		return new ModelAndView("viewall","msg","Product Deleted Sucessfully"); 
    	 	} 
    	  	@RequestMapping(value = "/admin/edit", method = RequestMethod.GET) 
    	  	 	public ModelAndView EditPage(@RequestParam("id") int id) { 
    	  	 		Product p = services.getById(id);
    	  	 		return new ModelAndView("/admin/updateProduct", "product", p); 
    	  		} 
    	  	@RequestMapping(value="/admin/edit", method=RequestMethod.POST)
    	  	public ModelAndView EditActionPage(HttpServletRequest request,@ModelAttribute("product") @Validated Product p, BindingResult result,Model model)
    	  	{
    	  		if(result.hasErrors())
    	  		{
    	  			System.out.println(result.getAllErrors());
    	  			return new ModelAndView("/admin/updateProduct");
    	  		}
    	  		else
    	  		{
    	  			System.out.println(p.getImage());
    	  			if(!(p.getFile().isEmpty()))
    	  			{
    	  				p.setImage(p.getFile().getOriginalFilename());
    	  				services.storeFile(p, request);
    	  			}
    	  			services.udateProduct(p);
    	  			return new ModelAndView("viewall","msg","Product Updated sucessfully ");
    	  		}
    	  	}
    	  	@RequestMapping(value="/err") 
    	  	 	public String errorPage(){ 
    	  	 		return "ErrorPage"; 
    	  	 		}
    	  	}
