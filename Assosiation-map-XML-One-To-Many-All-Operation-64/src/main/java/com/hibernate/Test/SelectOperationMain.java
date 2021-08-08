package com.hibernate.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.DAO.ApartImpl;
import com.hibs.utility.HBNutility;

public class SelectOperationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApartImpl obj=new ApartImpl();
	obj.SelectOperation(1);
	
	}

}
