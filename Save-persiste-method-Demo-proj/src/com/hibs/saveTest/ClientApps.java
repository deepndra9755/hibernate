package com.hibs.saveTest;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibs.Entity.Product;

public class ClientApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stubCOnfri

		Configuration cfg = new Configuration();
		cfg.configure("com/hibs/cfgs/hibernate.cfg.xml");
		SessionFactory ses = cfg.buildSessionFactory();
		Session obj = ses.openSession();
		Transaction tx = obj.beginTransaction();
		boolean flag=false;
		try {
			Product pc = new Product();
			pc.setCname("ksmsls");
			pc.setDiscount(1);
     		pc.setBill(6300.0f);
		 	pc.setAddress("kisanpura");
			int id=(int) obj.save(pc);
			System.out.println("genrated id"+id);
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
