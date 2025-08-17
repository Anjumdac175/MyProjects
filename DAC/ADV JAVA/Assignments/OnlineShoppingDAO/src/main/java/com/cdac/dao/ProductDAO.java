package com.cdac.dao;

import java.util.List;

import com.cdac.pojos.Product;

public interface ProductDAO {
	List<Product> getByCategoryId(Integer  categoryId);
	boolean addProduct(Product product);
}
