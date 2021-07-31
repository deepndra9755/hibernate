package com.hibernate.service;

import com.hibernate.dao.EmpImpl;
import com.hibernate.dao.IEmpDao;
import com.hibernate.dto.DTO;
import com.hibernate.vo.Voimpl;

public class EmployeeSallCalculator implements IEmpCal {

	IEmpDao dao;
	
	
	public EmployeeSallCalculator() {
	
		this.dao = new EmpImpl();
	}


	public Voimpl EmpCal(int h) throws Exception
	{
		DTO dt=dao.insertEmp(h);
		Voimpl obj=new Voimpl();
		obj.setLast(dt.getLast());
		obj.setName(dt.getName());
		obj.setSallary(dt.getSallary());
		dt.setPf(dt.getPf());
	
		return obj; 

		
		
	}
	

}
