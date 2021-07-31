package com.hibernate.Test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.BasicIn;
import com.hibernate.Entity.EmployeeInfo;
import com.hibernate.Entity.StudentInfo;
import com.hibs.utility.HBNutility;

public class SelectingData {
	static Transaction tx;	
public static void main(String[] args) {




Boolean flag=false;
try {
 
	Session ses=HBNutility.getSession();
System.out.println(ses);
tx=ses.beginTransaction();
	
	Query<StudentInfo> bd=ses.createQuery("from com.hibernate.Entity.StudentInfo");
   List<StudentInfo> pd=bd.getResultList();

   for(StudentInfo h:pd)
   {
	 System.out.println(h);  
   }
   
   
   
   Query<BasicIn> bd11=ses.createQuery("from com.hibernate.Entity.EmployeeInfo");
   List<BasicIn> pd1=bd11.getResultList();

   for(BasicIn h:pd1)
   {
	 System.out.println(h);  
   }
   
   
   System.out.println();
   Query<BasicIn> bd1=ses.createQuery("from com.hibernate.Entity.BasicIn");
   List<BasicIn> pd2=bd1.getResultList();

   for(BasicIn h:pd2)
   {
	 System.out.println(h);  
   }

   flag=true;
	
} catch (HibernateException e) {
	// TODO: handle exception
e.printStackTrace();
}

}
}
