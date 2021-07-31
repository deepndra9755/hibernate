package com.hibernate.DAO;

import javax.persistence.NamedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;

//@NamedQuery(name ="UPDATION_SBI", query = "update com.hibernate.Entity.SbiBank set Amount=:amt WHERE customerNAME=:nm")
//@NamedQuery(name ="updation",query ="update com.hibernate.Entity.SbiBank set Amount=?1 WHERE customerNAME=?2")
public class BankUpdationImpl implements IBankUpdation {
	Transaction tx = null;
	//@NamedQuery(name ="UPDATION_SBI", query = "update com.hibernate.Entity.SbiBank set Amount=:amt WHERE customerNAME=:nm")

	// String UPDATION_SBI="update com.hibernate.Entity.SbiBank set Amount=?1 WHERE
	// customerNAME=?2";
	@Override
	public int UpdataionRecord(String name, Float amount) {
		// TODO Auto-generated method stub

		Boolean flag = false;
		int count = 0;
		try {
			Session ses = HBNutility.getSession();
			tx = ses.beginTransaction();
              Query<SbiBank> ql=ses.createQuery("update com.hibernate.Entity.SbiBank set Amount=?1 WHERE customerNAME=?2");		
// 			ql.setFloat("amt", amount);
//			ql.setParameter("nm", name);
//						ql.setFloat(1,amount);
//						ql.setParameter(2,name);
              ql.setParameter(1,amount);
              ql.setParameter(2,name);
			count = ql.executeUpdate();
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		} finally {
			if (flag == true) {
				
				System.out.println("record coomited");
				tx.commit();
				return count;
			} else {
				System.out.println("not coomited");

				tx.rollback();
			}
			return count;
		}
	}

//	UPDATE Customers
//	SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
//	WHERE CustomerID = 1;

}
