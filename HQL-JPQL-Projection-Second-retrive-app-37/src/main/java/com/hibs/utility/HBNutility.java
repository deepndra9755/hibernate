package com.hibs.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.ProductInfo;

public class HBNutility {
	static Configuration cg;
	static SessionFactory sf;
	static
	{
	
	cg=new Configuration();	
	cg.configure("com/hibernate/cfg/hibernate.cfg.xml");
   
	System.out.println(cg);

	sf=cg.buildSessionFactory();
	if(sf==null)
	{
	new HibernateException("session-factory not created");	
	}
	}
	public static Session getSession()
	{
		return sf.getCurrentSession();
	}
	public static void CloseSES()
	{
		sf.close();
	}

}
