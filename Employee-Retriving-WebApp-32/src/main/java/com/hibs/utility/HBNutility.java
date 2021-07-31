package com.hibs.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBNutility {
	static Configuration cg;
	static SessionFactory sf;
	static ThreadLocal<Session> ss;
	static
	{
	
	cg=new Configuration();	
	cg=cg.configure("com/hibernate/cfg/hibernate.cfg.xml");
	sf=cg.buildSessionFactory();
	
	}
	public static Session getSession()
	{
		if(ss==null)
		{
		ss=new ThreadLocal<Session>();
		Session sd=sf.openSession();
		ss.set(sd);
	    return ss.get();
		}
		
		return ss.get();
		
		
	}
	public static void CloseSES()
	{
		ss.get();
	System.out.println();
	}

}
