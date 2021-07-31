package com.hibs.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibs.Entity.Roadlabor;
import com.hibs.utility.HBNutility;

public class MergeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		boolean flag=false;
		try	
		{
			Roadlabor g=new Roadlabor();
			System.out.println("first hascode "+g.hashCode());
		Session ses=HBNutility.getSession();
	    Roadlabor ds=ses.get(Roadlabor.class,5);
		System.out.println("second hascode "+ds.hashCode());
		
		g.setCustID(5); 
		g.setName("ronial");
		g.setLast("det");
		g.setPosition("er");
		g.setSallary(44000.0f);
		tx=ses.beginTransaction();
		System.out.println(tx);
		System.out.println("third hascode   "+ses.merge(g).hashCode());
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
