package com.cdac.dao;

import com.cdac.pojos.UserLogin;

public interface LoginDAO {
	
	UserLogin Authentication(String username, String password, String role);

}
