package com.hibernate.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.BasicInfo;
import com.hibernate.Entity.PersonDD;
import com.hibs.utility.HBNutility;

public class InsertingData {
	static Transaction tx;	
public static void main(String[] args) {

BasicInfo obj=new BasicInfo();

obj.setName("kanoj");
obj.setMobile(975453);
obj.setAddress("mainroadbamnala");
System.out.println(obj);
PersonDD ob=new PersonDD();
ob.setBranch("MCA");
ob.setEnroll("AN34DD");
ob.setRoll(23221);
System.out.println(ob);


Boolean flag=false;
try {
 
	Session ses=HBNutility.getSession();
System.out.println(ses);
tx=ses.beginTransaction();
	ses.save(obj);
	ses.save(ob);
	
	flag=true;
	
} catch (HibernateException e) {
	// TODO: handle exception
e.printStackTrace();
}
finally {
	if(flag==true)
	{
		tx.commit();
		System.out.println("inserted");
	}
	else
	{
		tx.rollback();
		System.out.println("failed");
		
	}
}
}
}
