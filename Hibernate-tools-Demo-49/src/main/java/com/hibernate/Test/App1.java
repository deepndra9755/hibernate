package com.hibernate.Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.Civil;
import com.hibs.utility.HBNutility;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=HBNutility.getSession();
		Transaction tx=null;
		boolean flag=false;
		int id=0;
		try
		{
			tx=ses.beginTransaction();
		
		Civil c=new Civil();
		c.setAddress("indore");
		c.setCity("indore");
		c.setDepartment("24322dd");
		c.setDepIdl("ssas");
		c.setSallary("5000");
		c.setId(58);
		c.setName("rajaramsingh");
		id=(int) ses.save(c);
		flag=true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			if(flag==true)
			{
				
			tx.commit();
			System.out.println("inserted  "+id);
			}
			else
			{
				tx.rollback();
			System.out.println("failed ");
			}
		}
		
		
		

	}

}
