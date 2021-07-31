package com.hibs.Test;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibs.Entity.Roadlabor;
import com.hibs.utility.HBNutility;

public class SaveOrUpdateTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //ArrayList  obj=new ArrayList();
//		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		try	
		{
		Session ses=HBNutility.getSession();
		//Roadlabor ds=ses.get(Roadlabor.class,10);
		System.out.println(ses);
		Roadlabor g=new Roadlabor();
		g.setCustID(10); 
		g.setName("vidhya");
		g.setLast("soni");
		g.setPosition("front-end-worker");
		g.setSallary(52000.0f);
		tx=ses.beginTransaction();
		System.out.println(tx);
		ses.saveOrUpdate(g);
		System.out.println();
		flag=true;
		}
		
		catch(HibernateException e)
		{	
		e.printStackTrace();	
		}
		finally
		{
		if(flag==true)
		{
		tx.commit();
		System.out.println("record inserted");	
		}
		else
		{
			tx.rollback();
			System.out.println("not insreted");
		}
		}

	}

}
