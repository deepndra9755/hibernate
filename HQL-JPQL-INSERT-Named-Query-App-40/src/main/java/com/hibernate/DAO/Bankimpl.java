package com.hibernate.DAO;

import javax.persistence.NamedQueries;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibs.utility.HBNutility;

public class Bankimpl implements IBankCustomer {
	
	//public static final String HQL_INSERT_CUST="INSERT INTO com.hibernate.Entity.SbiBank(pid,customerNAME,IFSC,Amount,ACnum)Select e.pid,e.customer,e.IFSCcode,e.Amount,e.AccountNum from com.hibernate.Entity.HdfcBank as e where e.Amount>:amt";
	@Override
	public String insert(int ball) {
		// TODO Auto-generated method stub
		Session ses=null;
		Float f=(float) ball;
		Transaction tx=null;
		String msg=null;
		Boolean flag=false;
		int count=0;
		try {
			
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		  Query<Integer> cnt=ses.getNamedQuery("HQL_INSERT_CUST");
		   cnt.setParameter("amt",f);
		  count=cnt.executeUpdate();
		  flag=true;
	}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(flag==true)
			{
				tx.commit();
				msg="record inserted"+count+"";
			}
			else
			{
				tx.rollback();
				msg="record inserted"+count+"";
				
			}
			}
		return msg;
		}
		

}
