package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.EmployeeReg;
import com.hibernate.dto.DTO;
import com.hibs.utility.HBNutility;

public class EmpImpl implements IEmpDao {
	Transaction tx=null;
	@Override
	public DTO insertEmp(int h) {

//		Configuration cg;
//		cg=new Configuration();	
//		cg.configure("com/hibernate/cfg/hibernate.cfg.xml");
//		SessionFactory seg=cg.buildSessionFactory();
	
	     Session ses=null;
		ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		System.out.println("this is main function session object "+ses);
	    EmployeeReg re=ses.get(EmployeeReg.class,h);
	   DTO obj=new DTO();
	   obj.setName(re.getName());
	   obj.setPf(re.getPf());
	   obj.setSallary(re.getSallary());
	   obj.setLast(re.getLast());
	   sestioncheck();
	  return obj;
		// TODO Auto-generated method stub
		 
	}
	public void sestioncheck()
	{
		Session ses=null;
		ses=HBNutility.getSession();
		System.out.println("this is second function session object "+ses);
			
	}

}
