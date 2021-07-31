package com.hibernate.Test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.BasicInfo;
import com.hibernate.Entity.PersonDD;
import com.hibs.utility.HBNutility;

public class SelectingData {
	static Transaction tx;	
public static void main(String[] args) {




Boolean flag=false;
try {
 
	Session ses=HBNutility.getSession();
System.out.println(ses);
tx=ses.beginTransaction();
	
	Query<PersonDD> bd=ses.createQuery("from com.hibernate.Entity.PersonDD");
   List<PersonDD> pd=bd.getResultList();

   for(PersonDD h:pd)
   {
	 System.out.println(h);  
   }
   Query<BasicInfo> bd1=ses.createQuery("from com.hibernate.Entity.BasicInfo");
   List<BasicInfo> pd1=bd1.getResultList();

   for(BasicInfo h:pd1)
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
