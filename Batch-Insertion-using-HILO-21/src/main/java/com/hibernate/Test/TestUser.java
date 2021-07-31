package com.hibernate.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.CarProduction;
import com.hibs.utility.HBNutility;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session ses=null;
	     Transaction tx=null;
	     boolean flag=false;
		ses=HBNutility.getSession();
		try {
		if(ses!=null)
		{
		tx=ses.beginTransaction();
		for(int s=0;s<=10;s++)
		{
			 int id;
        CarProduction ob=new CarProduction();
        ob.setCname("Swift");
        ob.setAverage("midium");
        ob.setCompany("maruti");
        ob.setPrice(300000.0f);
        ob.setCtype("T2");
        ob.setGair(6);
       id=(int)ses.save(ob);
       System.out.println("TestUser.main() id value "+id);
       
		}
        
		flag=true;
       
		}
		}catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(flag==true)
			{
			tx.commit();	
System.out.println("record inserted");
			}
			else {
				tx.rollback();
				System.out.println("failed ");
			}
		}

	}

}
