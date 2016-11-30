package com.niit.SaranyaBoutiqueBackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SaranyaBoutiqueBackend.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public void addCategory(Category c) {
		Session session = sessionFactory.openSession();
		session.save(c);
		session.close();
		
	}

}
