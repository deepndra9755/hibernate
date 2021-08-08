package com.hibernate.DAO;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.Apartment;
import com.hibernate.Entity.Interial;
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
			Set<Interial> ds=on.getInteria();
			System.out.println(ds+"    this is dao gen");
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
@Override
	public void SelectOperation(int i) {
		// TODO Auto-generated method stub
		
	
	Session ses=null;
	Transaction tx=null;
	boolean flag=false;
	try {
		
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		//Apartment h=ses.load(Apartment.class,i); 
		Apartment h=ses.get(Apartment.class,i);
		Set<Interial> j=h.getInteria();
		System.out.println(j);
	      //System.out.println(h);
		//flag=true;
	} catch (HibernateException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	

	}
@Override
public void updationRecord(int h,Apartment neww) {
	// TODO Auto-generated method stub
	
	Session ses=null;
	Transaction tx=null;
	boolean flag=false;
	try {
		
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		org.hibernate.query.Query<Apartment> kd=ses.createQuery("from com.hibernate.Entity.Apartment where houseNum=?1");
	      kd.setParameter(1,h);
	      List<Apartment> jd=kd.getResultList();
	      
	      Apartment d=jd.get(0);
	      d.setOwnername(neww.getOwnername());
	      d.setMobile(neww.getMobile());
	      d.setAddress(neww.getAddress());
	     // System.out.println("thiissssssssssssssssssssssssss"+d);
	      
	      // System.out.println(jd+"   list record");
	       flag=true;
	}catch (HibernateException e) {
		// TODO: handle exception
	}
	finally {
		if(flag==true)
		{
			tx.commit();
			System.out.println("updated");
		}
		else
		{
			tx.rollback();
			System.out.println("failded");
			
		}
	}
	
}
@Override
public void addNewChile(int id,Interial child) {
	// TODO Auto-generated method stub
	
	Session ses=null;
	Transaction tx=null;
	boolean flag=false;
	try {
		
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		Apartment ap=ses.get(Apartment.class,id);
		Set<Interial> it=ap.getInteria();
		it.add(child);
		   flag=true;
	}catch (HibernateException e) {
		// TODO: handle exception
	}
	finally {
		if(flag==true)
		{
			tx.commit();
			System.out.println("child inserted successfull");
		}
		else
		{
			tx.rollback();
			System.out.println("failded");
			
		}
	}
	
}
@Override
public void DeletingApartPt(String name) {
	// TODO Auto-generated method stub
	
}

}
