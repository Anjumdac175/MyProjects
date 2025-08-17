package com.cdac.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.DAO.ProductDAO;
import com.cdac.DBUtility.DBUtility;
import com.cdac.Pojo.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public List<Product> getProductsByCategoryId(Integer categoryId) {
		List<Product> list = new ArrayList<>();
		
		try(Connection dbconnect = DBUtility.getConnection();
			PreparedStatement psProduct = dbconnect.prepareStatement("SELECT * FROM products WHERE categoryId=?")){
			psProduct.setInt(1, categoryId);
			
			ResultSet rsProduct = psProduct.executeQuery();
			while(rsProduct.next()) {
				list.add(new Product(rsProduct.getInt(1),rsProduct.getString(2),rsProduct.getString(3),rsProduct.getString(4),rsProduct.getDouble(5),rsProduct.getInt(6)));
			}
			
		} catch (SQLException e) {
					e.printStackTrace();
				}
		
		
		return list;
	}

	@Override
	public Product getProductById(int productId) {
		Product product = null;
		
		try(Connection dbconnect = DBUtility.getConnection();
				PreparedStatement psProduct = dbconnect.prepareStatement("SELECT * FROM products WHERE productId=?")){
				psProduct.setInt(1, productId);
				
				ResultSet rsProduct = psProduct.executeQuery();
				while(rsProduct.next()) {
					product = new Product(rsProduct.getInt(1),rsProduct.getString(2),rsProduct.getString(3),rsProduct.getString(4),rsProduct.getDouble(5),rsProduct.getInt(6));
				}
				
			} catch (SQLException e) {
						e.printStackTrace();
					}
		
		return product;
	}

}
