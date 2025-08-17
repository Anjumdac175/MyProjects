package com.cdac.dao;

import java.util.List;

import com.cdac.pojos.Category;

public interface CategoryDAO {
	List<Category> getAllCategory();
	boolean addCategory(Category category);
	boolean updateCategory(Category category);
}
