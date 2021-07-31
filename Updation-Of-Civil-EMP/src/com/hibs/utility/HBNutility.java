package com.hibs.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBNutility {
	static Configuration cg;
	static SessionFactory sf;
	static
	{
	
	cg=new Configuration();	
	cg=cg.configure("com/hibs/cfgs/hibernate.cfg.xml");
	sf=cg.buildSessionFactory();
	if(sf==null)
	{
	new HibernateException("session-factory not created");	
	}
	}
	public static Session getSession()
	{
		return sf.openSession();
	}
	public static void CloseSES()
	{
		sf.close();
	}

}
