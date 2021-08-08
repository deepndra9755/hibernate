package com.hibernate.Test;

import java.util.List;

import com.hibernate.DAO.EmpDetailsimpl;
import com.hibernate.DAO.IEmpDetails;
import com.hibernate.Entity.EmpDetali;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IEmpDetails obj=new EmpDetailsimpl();
		List<EmpDetali> jd=obj.retriver();
		//System.out.println(jd.get(1).getClass());
//		System.out.println(jo);
		for(EmpDetali ob:jd)
		{ 
			EmpDetali fs=ob;
	     System.out.println(fs);
		}

	}

}
