package com.hibernate.Test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.PersonDD;
import com.hibs.utility.HBNutility;

public class SelectPersonDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
      Boolean flag= false;
		try {
			 
			Session ses=HBNutility.getSession();
			tx=ses.beginTransaction();
			flag=true;
			
			//got executed by single row operation
			//PersonDD md=ses.get(PersonDD.class,1);
			//System.out.println(md);
			Query<PersonDD> objd=ses.createQuery("from com.hibernate.Entity.PersonDD");
			List<PersonDD> kd=objd.getResultList();
			for(PersonDD k:kd)
			{
				System.out.println(k);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		finally {
			
		}

		
	}

}
