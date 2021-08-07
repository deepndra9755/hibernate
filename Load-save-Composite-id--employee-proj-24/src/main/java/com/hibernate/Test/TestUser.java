package com.hibernate.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.CarProduction;
import com.hibernate.Entity.CompositePNL;
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
		CompositePNL oc=new CompositePNL();
		 oc.setAverage("midiu");
		 oc.setPrice(300.0f);

        CarProduction ob=new CarProduction();
        ob.setCname("Swift");
         ob.setIdd(oc);
        ob.setCompany("maruti");
   
 
        
        ob.setCtype("T2");
        ob.setGair(6);
 
         ses.save(ob);
         //System.out.println("TestUser.main() id value "+id);
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
