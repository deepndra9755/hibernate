package com.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.hibernate.Entity.EmpDetali;
import com.hibs.utility.HBNutility;

public class EmpDetailsimpl implements IEmpDetails {

	public static final String QRY_TO_RETRIVE_EMP="SELECT * FROM sallac";
	Transaction tx=null;
	Session ses=null;
	boolean flag;
	
	@Override
	public List<EmpDetali> retriver() {
		// TODO Auto-generated method stub
		List<EmpDetali> dt=null;
		try
		{
		
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		NativeQuery<EmpDetali>nt=ses.createNativeQuery(QRY_TO_RETRIVE_EMP);
		nt.addEntity(EmpDetali.class);
		  dt=nt.getResultList();
		
	 flag=dt.contains(dt);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("catch blocjk");
		}
		finally {
			if(flag==true)
			{
				return dt;
			}
			
			
		}
		return dt;
	}

	
}
