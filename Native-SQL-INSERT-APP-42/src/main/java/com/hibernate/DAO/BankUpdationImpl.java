package com.hibernate.DAO;

import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hibernate.DTO.DTOimpl;
import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;

public class BankUpdationImpl implements IBankUpdation {
	public static final String Record_Insertion_native="INSERT INTO sbibank(pid,customername,ifsc,amount,ACnum) values(?1,?2,?3,?4,?5)";
	Transaction tx = null;
	Session ses = null;
	boolean flag=false;
	 int count;
@Override
	public String InsertingAC(DTOimpl ob)
	{
		try
		{
		// TODO Auto-generated method stub
        ses=HBNutility.getSession();
        tx=ses.beginTransaction();
          NativeQuery<SbiBank> sbi=ses.createNativeQuery(Record_Insertion_native);
         // pid,customername,ifsc,amount,ACnum
          sbi.setParameter(1,ob.getPid());
          sbi.setParameter(2,ob.getCustomerNAME());
          sbi.setParameter(3,ob.getIFSC());
          sbi.setParameter(4,ob.getAmount());
          sbi.setParameter(5,ob.getACnum());
          count=sbi.executeUpdate();
          flag=true;
		}
		catch (Exception e) {
			// TODO: handle exception
		    System.out.println("exception got catch");
		    e.printStackTrace();
			throw e;
			
		}
		finally {
			if(flag==true)
			{	
			tx.commit();
			return "record inserted and id "+ob.getPid();
			}
			else
			{
				tx.rollback();
		    }
			return "insertion failed id";
		}
	}

}
