package com.hibs.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibs.Entity.Civil;
import com.hibs.utility.HBNutility;

public class UserTestApproach3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=null;
		
		Transaction tx=null;
		boolean flag=false;
		Civil cf=null;
		try
		{
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		//System.out.println(ses);
	
		 cf=ses.load(Civil.class,7);
		System.out.println(cf);
		Thread.sleep(60000);
		ses.refresh(cf);
		
		System.out.println(cf);
		
		flag=true;
		
		}
		catch(HibernateException e)
		{
		flag=false;	
		e.printStackTrace();	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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
