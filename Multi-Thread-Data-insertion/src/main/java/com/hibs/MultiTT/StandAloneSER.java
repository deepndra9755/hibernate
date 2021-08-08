package com.hibs.MultiTT;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibs.Entity.ProductOn;
import com.hibs.utility.HBNutility;

public class StandAloneSER implements Runnable {

	public final Session ses = HBNutility.getSession();
	private final ProductOn pc1;

	public StandAloneSER(ProductOn pc) {
		pc1 = pc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Transaction tx=null;
		boolean b=false;
      try
      {
    	  tx=ses.beginTransaction();
    	  //int id;
    	  if(ses!=null)
    	  {
    	   int id =(int) ses.save(pc1);
    	   System.out.println("id value of  "+Thread.currentThread().getName()+" "+id);
    	    b=true;
    	  }
      }
    	  catch (Exception e) {
			// TODO: handle exception
    		  e.printStackTrace();
		   }
    	  finally {
                      if(b==true)
                      {
                    	System.out.println("recored inserted");  
                      tx.commit();
                      }
                      else
                      {
                    	  System.out.println("faailded");
                          tx.rollback();
                      }
            		}
      }
	
	}

