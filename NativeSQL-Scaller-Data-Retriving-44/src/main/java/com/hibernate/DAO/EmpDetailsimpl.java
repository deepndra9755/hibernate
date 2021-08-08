package com.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.hibernate.Entity.EmpDetali;
import com.hibs.utility.HBNutility;

public class EmpDetailsimpl implements IEmpDetails {

	public static final String QRY_TO_specific_EMP="SELECT name,last,sall FROM sallac where name like ?1";
	Transaction tx=null;
	Session ses=null;
	boolean flag;
	
	@Override
	public List<Object[]> retriverScaler() {
		// TODO Auto-generated method stub
		List<Object[]> dt=null;
		try
		{
		
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		NativeQuery<Object[]>nt=ses.createNativeQuery(QRY_TO_specific_EMP);
		nt.setParameter(1,"k%");
		nt.addScalar("name");
		nt.addScalar("last");
		nt.addScalar("sall");
		
		
		  dt=nt.getResultList();
		System.out.println(dt.size());
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
