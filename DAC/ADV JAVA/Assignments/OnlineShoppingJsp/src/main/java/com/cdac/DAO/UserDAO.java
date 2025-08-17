package com.cdac.DAO;

import com.cdac.Pojo.UserLogin;

public interface UserDAO {

	UserLogin authenticate(String username, String password);
}
