package com.cdac.DAO;

import java.util.List;

import com.cdac.Pojo.Product;

public interface ProductDAO {

	List<Product> getProductsByCategoryId(Integer categoryId);
	 Product getProductById(int productId);
}
