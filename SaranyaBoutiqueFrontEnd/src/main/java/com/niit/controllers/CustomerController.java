package com.niit.controllers;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.models.User;
import com.niit.services.Customer_Service;

@Controller
public class CustomerController {
	@Autowired
	private Customer_Service customerService;
	
	@RequestMapping(value="/login")
	public String Login()
	{
		return "Login";
	}
	
	
	@RequestMapping(value="/Register" , method=RequestMethod.GET)
	public ModelAndView Register()
	{
		return new ModelAndView("Register","user", new User());
	}
	@RequestMapping(value="/Register" , method=RequestMethod.POST)
	public ModelAndView Register(@ModelAttribute("user")@Valid User c,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
			//System.out.println(c.getPassword());
			return new ModelAndView("Register");
		}
		else {
		customerService.addCustomer(c);
			
		}
		
		return new ModelAndView("Login","logoutmsg", "Registered Sucessfully please login now...");
	}
	@RequestMapping(value="/fail2login", method=RequestMethod.GET)
	public ModelAndView loginerror(ModelMap model)
	{
	  return new ModelAndView("Login","error",true);
	}

	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response)
	{
	  Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	   if(auth!= null)
	     {
		new SecurityContextLogoutHandler().logout(request, response, auth);
	     }
	   return new ModelAndView("Login","logoutmsg","Logged out Successfully");
	}

	 @RequestMapping(value = "/welcome", method = RequestMethod.GET)
		    public String printWelcome(ModelMap model, Principal principal) {
		        return "index";

		    }

}
