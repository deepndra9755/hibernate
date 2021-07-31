package com.hibernate.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Random;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.ProductInfo;
import com.hibs.utility.HBNutility;

public class TestApp {
	
public static void main(String[] args) {
	Query<ProductInfo>os=null;
	Session ses=null;
	Transaction tx=null;
	
	Boolean flag=false;
	try {
		
	ses=HBNutility.getSession();
	tx=ses.beginTransaction();
	System.out.println("session obj"+ses);
	String q="from com.hibernate.Entity.ProductInfo ";
	os=ses.createQuery(q);
	Iterator<ProductInfo> hd=os.iterate();
	while(hd.hasNext())
	{
	ProductInfo p=hd.next();
	System.out.println(p);
	}
//	os.setParameter(1,500.0f);
//	List<ProductInfo> kd=os.getResultList();
//
//	for(ProductInfo p:kd)
//	{
//	ProductInfo g=p;
//	System.out.println(g);
//	}
	
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
