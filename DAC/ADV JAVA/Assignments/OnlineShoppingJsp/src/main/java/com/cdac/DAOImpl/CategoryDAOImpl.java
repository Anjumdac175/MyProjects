package com.cdac.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.DAO.CategoryDAO;
import com.cdac.DBUtility.DBUtility;
import com.cdac.Pojo.Category;

public class CategoryDAOImpl implements CategoryDAO {

	@Override
	public List<Category> getAllCategory() {
		
		List<Category> list = new ArrayList<>();
		 try(Connection dbconnect = DBUtility.getConnection();
				 PreparedStatement psCategory = dbconnect.prepareStatement("SELECT * FROM category");
						 ResultSet rsCategory = psCategory.executeQuery()){
			 
			 while(rsCategory.next()) {
				 list.add(new Category(rsCategory.getInt(1),rsCategory.getString(2), rsCategory.getString(3),rsCategory.getString(4)));
			 }
			 
		 } catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
