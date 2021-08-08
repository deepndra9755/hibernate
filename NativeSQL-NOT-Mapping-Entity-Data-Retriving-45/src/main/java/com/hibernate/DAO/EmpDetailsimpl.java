package com.hibernate.DAO;

import java.util.List;

import javax.persistence.NamedNativeQuery;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.springframework.jdbc.object.SqlQuery;

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
		//List<EmpDetali> dt=null;
		try
		{
		
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		SqlQuery<Object[]>jds =(SqlQuery<Object[]>) ses.createSQLQuery(QRY_TO_RETRIVE_EMP);
		//nt.addEntity(EmpDetali.class);
		 
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
