package com.hibs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibs.Entity.MaskShop;
import com.hibs.proxy.Myproxy;
import com.hibs.utility.HBNutility;

public class AnnoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session ses=null;
		Transaction tx=null;
		Boolean flag=false;
		try
		{
			ses=HBNutility.getSession();
			if(ses!=null)
			{
				Myproxy ss=ses.load(Myproxy.class,2);
				
			flag=true;
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(flag==true)
			{
			System.out.println("record displayed of proxy");	
		
			}
			else
			{
				System.out.println("failed");
		
			}
		}

	}

}
