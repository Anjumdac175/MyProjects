package com.cdac.firstHibernet;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cdac.firstHibernet.entity.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration hibernateConfiguration = null;
        SessionFactory hibernateFactory = null;
        Session hibernateSession = null;
        
        try {
        	hibernateConfiguration = new Configuration();
        	hibernateConfiguration.configure("first.cfg.xml");
        	hibernateFactory = hibernateConfiguration.buildSessionFactory();
        	hibernateSession = hibernateFactory.openSession();
        	
        	try (Scanner sc = new Scanner(System.in)){
        		System.out.println("Enter the UserName:");
        		String userName = sc.nextLine();
        		System.out.println("Enter the Password:");
        		String password = sc.nextLine();
        		System.out.println("Enter the Role:");
        		String role = sc.nextLine();
        		System.out.println("Enter the Balance:");
        		Double balance = sc.nextDouble();
        		
        		Users objUser = new Users(userName,password,role,balance);
        		hibernateSession.beginTransaction();
        		hibernateSession.persist(objUser);
        		hibernateSession.getTransaction().commit();
        		System.out.println("User Registered");
        	}
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
        	if(hibernateSession!=null)
        		hibernateSession.close();
        	if(hibernateFactory!=null)
        		hibernateFactory.close();
        }
    }
}
