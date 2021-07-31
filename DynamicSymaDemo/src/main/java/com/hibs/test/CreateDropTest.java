package com.hibs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibs.Entity.ProductOn;
import com.hibs.utility.HBNutility;

public class CreateDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses = null;
		Transaction tx = null;
		Boolean flag = false;
		try {

			ProductOn sd = new ProductOn();
			sd.setName("shivani");
			sd.setCompany("PDX");
			sd.setCode(190);
			sd.setType("vegitab");

			ses = HBNutility.getSession();

			if (ses != null) {
				int sds = (int) ses.save(sd);
				System.out.println("id value  " + sds);
				flag = true;
				tx = ses.beginTransaction();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (flag == true) {
				System.out.println("record inserted");
				tx.commit();
				try {
					Thread.sleep(50000);

				} catch (Exception e) {
					// todo auto-generated catch block
					e.printStackTrace();
				}

			} else {
				System.out.println("failed");
				tx.rollback();
			}

			HBNutility.CloseSES();
		}

	}

}
