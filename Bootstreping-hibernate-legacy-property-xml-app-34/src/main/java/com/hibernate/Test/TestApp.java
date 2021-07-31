package com.hibernate.Test;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.ProductInfo;
import com.hibs.utility.HBNutility;

public class TestApp {
	
public static void main(String[] args) {
	
	Session ses=null;
	Transaction tx=null;
	Boolean flag=false;
	try {
	ses=HBNutility.getSession();
	System.out.println("session obj"+ses);
	
	ProductInfo pd=new ProductInfo();
	pd.setPname("biskit");
	pd.setPrise(500.0f);
	pd.setSerialNum(new Random().nextInt(5000)+""+"");
	tx=ses.beginTransaction();
	int id=(int)ses.save(pd);
	if(id>0)
		flag=true;
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
		else
		{
		tx.rollback();	
		 System.out.println("incord not inserted");
			
		}
	}
}

}
