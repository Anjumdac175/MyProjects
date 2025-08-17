package com.cdac.DAO;

import java.util.List;

public class UsersMain {

	public static void main(String[] args) {
		UserDAO dao = new UserDAOImpl();
		List<Users> user = dao.getAllUsers();
		
		for(Users list : user) {
			System.out.println(list);
		}

	}

}
