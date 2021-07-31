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
    Query<Object[]> os=null;
	Session ses=null;
	Transaction tx=null;
	
	Boolean flag=false;
	try {
		
	ses=HBNutility.getSession();
	tx=ses.beginTransaction();
	System.out.println("session obj"+ses);
	String q="select pname,prise from com.hibernate.Entity.ProductInfo where prise>:des";
	os=ses.createQuery(q);
    os.setParameter("des",70.0f);
//	Iterator<ProductInfo> hd=os.iterate();
//	while(hd.hasNext())
//	{
//	ProductInfo p=hd.next();
//	System.out.println(p);
//	}
//	os.setParameter(1,500.0f);
	List<Object[]> kd=os.getResultList();
	
for(Object j[]:kd)
{
 Object name = j[0];
 Object price = j[1];
System.out.println(name+" "+price ); 

}
	
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
