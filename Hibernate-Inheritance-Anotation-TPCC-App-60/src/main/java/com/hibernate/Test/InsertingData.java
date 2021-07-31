package com.hibernate.Test;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.EmployeeInfoCC;
import com.hibernate.Entity.GEN_INFOCC;
import com.hibernate.Entity.StudentInfoCC;
import com.hibs.utility.HBNutility;

public class InsertingData {
	static Transaction tx;	
public static void main(String[] args) {




//System.out.println(obj);
//	GEN_INFOCC o=new GEN_INFOCC();
//	o.setAddress("dewas");
//	o.setMobile(89789);
//	o.setName("hasina");
StudentInfoCC ob=new StudentInfoCC();

ob.setBranch("UPSC");
ob.setEnroll("DIOPKL00");
ob.setRoll(837483);
ob.setName("aadesh");
ob.setMobile(938300);
ob.setAddress("bhikangaon");
System.out.println(ob);
EmployeeInfoCC ob2=new EmployeeInfoCC();
ob2.setName("diggii");
ob2.setDepartment("polish");
ob2.setJobtype("permanent");
ob2.setAddress("khandwa");
ob2.setMobile(999333);
ob2.setSallary(34000.0f);



Boolean flag=false;
try {
 
	Session ses=HBNutility.getSession();
System.out.println(ses);
tx=ses.beginTransaction();
//ses.save(o);
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
