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
    cg.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
    cg.setProperty("hibernate.connection.url","jdbc:mysql://@localhost:3306/emp");
    cg.setProperty("hibernate.connection.username","root");

    cg.setProperty("hibernate.connection.password","root");

    cg.setProperty("hibernate.show_sql","true");

    cg.setProperty("hibernate.hbm2ddl.auto","update");

	System.out.println(cg);
	
	cg.addAnnotatedClass(com.hibernate.Entity.ProductInfo.class);

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
