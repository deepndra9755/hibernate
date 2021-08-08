package com.hibernate.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.DAO.ApartImpl;
import com.hibernate.Entity.Apartment;
import com.hibs.utility.HBNutility;

public class UpdatingParentTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApartImpl s=new ApartImpl();
		Apartment os=new Apartment();
		os.setAddress("baroda");
		os.setMobile(228333);
		os.setOwnername("pinkesh");
	

		s.updationRecord(111,os);
	
	}

}
