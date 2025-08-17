package com.cdac.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.DBUtil.DBUtility;
import com.cdac.dao.CategoryDAO;
import com.cdac.pojos.Category;

public class CategoryImpl implements CategoryDAO {

	@Override
	public List<Category> getAllCategory() {
		
		List<Category> allcategory = new ArrayList<>();
		
		try(Connection dbconnect = DBUtility.getConnection();
			PreparedStatement psCategory = dbconnect.prepareStatement("SELECT * FROM Category");
				ResultSet rsCategory = psCategory.executeQuery()){
			
			while(rsCategory.next()) {
				
				allcategory.add(new Category(rsCategory.getInt(1), rsCategory.getString(2), rsCategory.getString(3), rsCategory.getString(4)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allcategory;
	}



	@Override
	public boolean addCategory(Category category) {
		String insertQuery = "INSERT INTO category(categoryName, categoryDesc, categoryImg) values(?,?,?)";
		try(Connection dbconnect = DBUtility.getConnection();
				PreparedStatement psAddCategory = dbconnect.prepareStatement(insertQuery)){
			psAddCategory.setString(1, category.getCategoryName());
			psAddCategory.setString(2, category.getCategoryDesc());
			psAddCategory.setString(3, category.getCategoryImg());
			
			 return psAddCategory.executeUpdate()>0;
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	@Override
	public boolean updateCategory(Category category) {
	    String query = "UPDATE Category SET categoryName = ?, categoryDesc = ?, categoryImg = ? WHERE categoryId = ?";
	    
	    try (Connection conn = DBUtility.getConnection();
	         PreparedStatement ps = conn.prepareStatement(query)) {

	        ps.setString(1, category.getCategoryName());
	        ps.setString(2, category.getCategoryDesc());
	        ps.setString(3, category.getCategoryImg());
	        ps.setInt(4, category.getCategoryId());

	        return ps.executeUpdate() > 0;

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}


}
