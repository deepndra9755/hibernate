package com.hibernate.DAO;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.Apartment;
import com.hibs.utility.HBNutility;

public class ApartImpl implements IApart {

	@Override
	public void InsertStd(Apartment on) {
		// TODO Auto-generated method stub
		
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		try {
			
			ses=HBNutility.getSession();
			tx=ses.beginTransaction();
			int id =(int) ses.save(on);
			flag=true;
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(flag==true)
			{
				tx.commit();
				System.out.println("record inserted");
			}
			else
			{
				tx.rollback();
				System.out.println("falied");
			}
		}
		
	}

}
