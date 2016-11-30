package com.niit.SaranyaBoutiqueBackend.dao;

import org.springframework.stereotype.Repository;

import com.niit.SaranyaBoutiqueBackend.model.Category;

@Repository
public interface CategoryDao {
	void addCategory(Category c);

}
