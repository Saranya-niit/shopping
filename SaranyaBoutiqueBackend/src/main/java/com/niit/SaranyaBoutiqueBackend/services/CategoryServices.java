package com.niit.SaranyaBoutiqueBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.niit.SaranyaBoutiqueBackend.dao.CategoryDao;
import com.niit.SaranyaBoutiqueBackend.model.Category;


@Service
public class CategoryServices {
	@Autowired
  private CategoryDao categoryDao;
	
	public void addCategory(Category c) {
		categoryDao.addCategory(c);
	}
}
