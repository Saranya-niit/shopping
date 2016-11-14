package com.niit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	   return "view all";
   }
}
