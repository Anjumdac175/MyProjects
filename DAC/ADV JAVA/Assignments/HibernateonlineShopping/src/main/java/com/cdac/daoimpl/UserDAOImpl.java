package com.cdac.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cdac.dao.UserDAO;
import com.cdac.entity.User;
import com.cdac.utilty.HibernateUtil;


public class UserDAOImpl implements UserDAO{

	@Override
	public User GetUser(String username, String password) {
		Transaction transaction = null;
		User user =null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			session.beginTransaction();
			
			Query<User> query = session.createQuery("FROM users WHERE username= :uname AND password= :pswd ",User.class);
			query.setParameter("uname", username);
			query.setParameter("pswd", password);
			
			user = query.uniqueResult();
			
			transaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
