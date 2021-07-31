package com.hibernate.Test;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.EmployeeInfo;
import com.hibernate.Entity.StudentInfo;
import com.hibs.utility.HBNutility;

public class InsertingData {
	static Transaction tx;	
public static void main(String[] args) {




//System.out.println(obj);
StudentInfo ob=new StudentInfo();

ob.setBranch("MCA");
ob.setEnroll("YUN34DD");
ob.setRoll(113221);
ob.setName("kamal");
ob.setMobile(732928);
ob.setAddress("bhopal");
System.out.println(ob);
EmployeeInfo ob2=new EmployeeInfo();
ob2.setName("shiv");
ob2.setDepartment("IT");
ob2.setJobtype("permanenet");
ob2.setAddress("indore");
ob2.setMobile(492382);
ob2.setSallary(30000.0f);



Boolean flag=false;
try {
 
	Session ses=HBNutility.getSession();
System.out.println(ses);
tx=ses.beginTransaction();
	ses.save(ob);
	ses.save(ob2);	
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
