package com.hibernate.TestApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.Caller_tune;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cff = null;
		SessionFactory sef = null;
		Session ses = null;
		boolean flag = false;

		Transaction tx = null;
		try {
			cff = new Configuration();
			cff.configure("com/hibernate/Cfg/hibernate.cfg.xml");
			sef = cff.buildSessionFactory();
//			Caller_tune cd = new Caller_tune();
//			cd.setLastNm("mandloi");
//			cd.setSimOwner("shivedra");
//			cd.setLocation("khargone");
			ses = sef.openSession();
			tx = ses.beginTransaction();
			Caller_tune dr=ses.get(Caller_tune.class,2);
			dr.setSimOwner("kamas");
			ses.save(dr);
			
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cougth-exception");
			e.printStackTrace();
		}
		
		  finally { 
			  
			  if(flag==true)
			  { 
				  tx.commit();
		  System.out.println("record inserted"); } else { tx.rollback();
		  System.out.println("falied"); } }
		 

	}

}
