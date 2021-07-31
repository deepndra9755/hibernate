package com.hibs.persist;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibs.Entity.Product;

public class PersisteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("com/hibs/cfgs/hibernate.cfg.xml");
		SessionFactory ses = cfg.buildSessionFactory();
		Session obj = ses.openSession();
		Transaction tx = obj.beginTransaction();
		boolean flag=false;
		try {
			Product pc = new Product();
	    
			pc.setPid(18);
			pc.setCname("dolll");
			pc.setDiscount(7);
     		pc.setBill(730000.0f);
		 	pc.setAddress("UK");
			obj.persist(pc);
			//System.out.println("genrated id"+id);
			flag = true;

		} catch (HibernateException e) {
			// TODO: handle exception
			flag = false;
		} finally {
			if (flag==true) {
				tx.commit();
				System.out.println("record inserted succesfully");
			} else {
				tx.rollback();
				System.out.println("not inserted record");
			}
		}


	}

}
