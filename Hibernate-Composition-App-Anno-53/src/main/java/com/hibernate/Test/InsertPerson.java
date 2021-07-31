package com.hibernate.Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.BasicInfo;
import com.hibernate.Entity.PersonDD;
import com.hibs.utility.HBNutility;

public class InsertPerson {
	static Transaction tx;	
public static void main(String[] args) {

BasicInfo obj=new BasicInfo();

obj.setName("sachin");
obj.setMobile(503828);
obj.setAddress("mainroad");
System.out.println(obj);
PersonDD ob=new PersonDD();
ob.setBasic(obj);
ob.setBranch("CAB");
ob.setEnroll("UF8893");
ob.setRoll(13221);
System.out.println(ob);


Boolean flag=false;
try {
 
	Session ses=HBNutility.getSession();
	tx=ses.beginTransaction();
	ses.save(ob);
	flag=true;
} catch (Exception e) {
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
