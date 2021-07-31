package com.hibernate.Mymain;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.BankAC;

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
			BankAC b = new BankAC();
			ses = sef.openSession();
			tx = ses.beginTransaction();
		     b.setAccountNum(12333);
		     b.setName("dipek");
			b.setOpendate(LocalDate.now());
			ses.save(b);
//			b = ses.get(BankAC.class, 1);
//			b.setName("shivam");
		ses.save(b);
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cougth-exception");
			e.printStackTrace();
		}

		finally {

			if (flag == true) {
				tx.commit();
				System.out.println("record inserted");
			} else {
				tx.rollback();
				System.out.println("falied");
			}
		}

	}

}
