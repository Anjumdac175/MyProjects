package com.cdac.utilty;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cdac.entity.User;

public class HibernateUtil {
	private static SessionFactory hibernateFactory;

	static{
		
		try {
		
		Configuration hibernateConfiguration = new Configuration();
		Properties props = new Properties();
		 InputStream input = Thread.currentThread().getContextClassLoader()
                 .getResourceAsStream("application.properties");
         
         if (input == null) {
             throw new RuntimeException("application.properties not found in classpath");
         }

         props.load(input);
//		props.load(new FileInputStream("application.properties"));
		hibernateConfiguration.setProperties(props);
		hibernateConfiguration.addAnnotatedClass(User.class);
		
		hibernateFactory = hibernateConfiguration.buildSessionFactory();
		}catch(Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("Hibernate session factory setup failed");
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return hibernateFactory;
	}

}
