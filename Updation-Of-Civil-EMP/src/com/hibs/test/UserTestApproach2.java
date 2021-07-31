package com.hibs.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibs.Entity.Civil;
import com.hibs.utility.HBNutility;

public class UserTestApproach2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=null;
		
		Transaction tx=null;
		boolean flag=false;
		try
		{
		ses=HBNutility.getSession();
		
		System.out.println(ses);
		
		Civil cf=ses.load(Civil.class,7);
		cf.setName("deepi");
		ses.update(cf);
		flag=true;
		tx=ses.beginTransaction();
		}
		catch(HibernateException e)
		{
		flag=false;	
		e.printStackTrace();	
		}
		finally 
		{
		if(flag==true)
		{
			tx.commit();
		System.out.println("record /updated");	
		}
		else
		{
			tx.rollback();
		System.out.println("record not updated");	
		}
		}
		

	}


}
