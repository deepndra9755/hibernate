

 package com.hibs.Client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibs.Entity.BusBooking;

public  class  BusCentLoadTest {
	public static void main(String[] args) {
		Configuration cg = new Configuration();
		cg = cg.configure("com/hibs/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cg.buildSessionFactory();
		Session ses = sf.openSession();
		Boolean flag=false;

		// not requred while getting records from db
		// Transaction tx=null;
		try {
			BusBooking pc = ses.load(BusBooking.class, 10);
			System.out.println("this is load()  "+pc.getClass().getName()+"   "+pc.getClass().getSuperclass());
			System.out.println(pc);
			flag=true;
			
		} catch (HibernateException e) {
			// TODO: handle exception
			flag=false;
		} finally {

			if(flag==true)
			{
			System.out.println("record displayed");	
			}
			else
				System.out.println("not found");
		}
	}

}