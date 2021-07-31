package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.EmployeeReg;
import com.hibernate.dto.DTO;
import com.hibs.utility.HBNutility;

public class EmpImpl implements IEmpDao {
  
	@Override
	public int insertEmp(DTO od) {
		System.out.println("getting data from service "+od);
//		Configuration cg;
//		cg=new Configuration();	
//		cg.configure("com/hibernate/cfg/hibernate.cfg.xml");
//		SessionFactory seg=cg.buildSessionFactory();
		Transaction tx=null;
	     Session ses=null;
		ses=HBNutility.getSession();
		
		tx=ses.beginTransaction();
	    
		// TODO Auto-generated method stub
		EmployeeReg obj=new EmployeeReg();
		obj.setName(od.getName());
		obj.setLast(od.getLast());
		obj.setSallary(od.getSallary());
		obj.setDepid(""+od.getDepid());
		obj.setPf(od.getPf());
		int d=(Integer)ses.save(obj);
		System.out.println(ses);
		
		boolean flag=false;
		int rs=0;
		try {
		rs=(int)ses.save(obj);
		flag=true;
		}
		catch (Exception e) {
		// TODO: handle exception
			throw e;
		}
		finally {
			if(flag==true)
			{
			tx.commit();
			return rs;	
			}
			else
			{
				tx.rollback();
			return rs;	
			}
		}
		
		 
	}
	

}
