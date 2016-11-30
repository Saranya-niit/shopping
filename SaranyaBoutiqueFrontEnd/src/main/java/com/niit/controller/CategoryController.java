package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.SaranyaBoutiqueBackend.model.Category;
import com.niit.SaranyaBoutiqueBackend.services.CategoryServices;


@Controller
public class CategoryController {
	@Autowired
	private CategoryServices categoryServices;
	
	@RequestMapping(value="/admin/addCategory", method=RequestMethod.GET)
	public ModelAndView addCategory(){
		Category c = new Category();
		ModelAndView mv = new ModelAndView("/admin/addCategory","category",c);
		return mv;
	}
	
	@RequestMapping(value="/admin/addCategory", method=RequestMethod.POST)
	public String addCategory(@ModelAttribute(name="category") Category c,Model m){
			categoryServices.addCategory(c);
		return "addCategory";
	
	}
	
}
