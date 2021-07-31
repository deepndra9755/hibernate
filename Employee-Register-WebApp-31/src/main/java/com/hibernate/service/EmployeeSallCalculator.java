package com.hibernate.service;

import com.hibernate.dao.IEmpDao;
import com.hibernate.dto.DTO;
import com.hibernate.vo.Voimpl;

public class EmployeeSallCalculator implements IEmpCal {

	IEmpDao dao;
	
	public EmployeeSallCalculator(IEmpDao dao) {
		this.dao = dao;
	}


	public int EmpCal(Voimpl ob)throws Exception
	{
		System.out.println("receving data from monitor and disp..."+ob);
		// TODO Auto-generated method stub
		float sall=ob.getSallary();
		int pff=(int)sall-1000;
		DTO op=new DTO();
		op.setLast(ob.getLast());
		op.setName(ob.getName());
        op.setPf(pff);
		op.setSallary(ob.getSallary());
		
		return dao.insertEmp(op);
	}

	

}
