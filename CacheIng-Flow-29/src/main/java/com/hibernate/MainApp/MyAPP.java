package com.hibernate.MainApp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.Caller;
import com.hibs.utility.HBNutility;

public class MyAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=null;
		Transaction tx=null;
		Caller ct=null;
		boolean flag=false;
		try{
			ses=HBNutility.getSession();	
		
		     Caller bb=new Caller();
//		     bb.setSimOwner("rajnish");  for first insertion
//		     bb.setLastNm("chodhary");
//		     bb.setLocation("khargone");
		    tx=ses.beginTransaction();
		    Caller x=ses.get(Caller.class,2);
		    System.out.println(x);
		    x.setLastNm("verma");
		    x.setSimOwner("sid");
		    ses.evict(bb);
		    System.out.println();
		    Caller x1=ses.get(Caller.class,2);
		    System.out.println(x1);
//		    x1.setLastNm("pannu");
//		    x1.setSimOwner("tapsi");
		    System.out.println();
		    Caller x3=ses.get(Caller.class,2);
		    
		    
		    Caller x2=ses.get(Caller.class,2);
		    x2.setLastNm("deshmukh");
		    x2.setSimOwner("piyush");
		    ses.save(bb);
	
			flag=true;
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("exception-Coungth");
		}
		finally {
			if(flag==true)
			{
				System.out.println("inserted");	
				tx.commit();
	
			}
			else
			{
				System.out.println("falied");
				tx.rollback();
			}
		}

	}

}
