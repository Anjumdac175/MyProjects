package com.cdac.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.DBUtil.DBUtility;
import com.cdac.dao.ProductDAO;
import com.cdac.pojos.Product;

public class ProductImpl implements ProductDAO {

	@Override
	public List<Product> getByCategoryId(Integer categoryId) {
		
		List<Product> allProducts = new ArrayList<>();
		
		try(Connection dbconnect = DBUtility.getConnection();
				PreparedStatement psProducts = dbconnect.prepareStatement("SELECT * FROM products WHERE categoryId=?")){
			
			psProducts.setInt(1, categoryId);
			
			ResultSet rsProducts = psProducts.executeQuery();
			while(rsProducts.next()) {
				allProducts.add(new Product(rsProducts.getString(2), rsProducts.getString(3), rsProducts.getString(4), rsProducts.getDouble(5),rsProducts.getInt(6)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allProducts;
	}

	@Override
	public boolean addProduct(Product product) {
		
		String insertQuery = "INSERT INTO Products(ProductName, ProductDescription, ProductImageUrl, Price, categoryId) values(?,?,?,?,?)";
		
		try(Connection dbconnect = DBUtility.getConnection();
			PreparedStatement psAddProduct = dbconnect.prepareStatement(insertQuery)){
			psAddProduct.setString(1, product.getProductName());
			psAddProduct.setString(2, product.getProductDes());
			psAddProduct.setString(3, product.getProductimg());
			psAddProduct.setDouble(4, product.getPrice());
			psAddProduct.setInt(5, product.getCategoryId());
			
			return psAddProduct.executeUpdate()>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
