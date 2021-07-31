package com.hibernate.MainApp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.Caller;
import com.hibs.utility.HBNutility;

public class MyAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=null;
		Transaction tx=null;
		Caller ct=null;
		boolean flag=false;
		try{
			ses=HBNutility.getSession();
			
			System.out.println(ses);
			
		ct=ses.get(Caller.class,1);
		ct.setSimOwner("vid");
			tx=ses.beginTransaction();
//			
			flag=true;
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("exception-Coungth");
		}
		finally {
			if(flag==true)
			{
				System.out.println("inserted");	
				tx.commit();
	
			}
			else
			{
				System.out.println("falied");
				tx.rollback();
			}
		}

	}

}
