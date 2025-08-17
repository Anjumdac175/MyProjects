package com.cdac.dao;

import com.cdac.entity.User;

public interface UserDAO {

	public User GetUser(String username, String password);
}
