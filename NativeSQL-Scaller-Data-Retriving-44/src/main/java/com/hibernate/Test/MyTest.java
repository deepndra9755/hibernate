package com.hibernate.Test;

import java.util.List;

import com.hibernate.DAO.EmpDetailsimpl;
import com.hibernate.DAO.IEmpDetails;
import com.hibernate.Entity.EmpDetali;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IEmpDetails obj=new EmpDetailsimpl();
		List<Object[]> jd=obj.retriverScaler();
		//System.out.println(jd.get(1).getClass());
//		System.out.println(jo);
		for(Object []ob:jd)
		{ 
			 String k=(String) ob[1];
			 System.out.println(k);
		}

	}

}
