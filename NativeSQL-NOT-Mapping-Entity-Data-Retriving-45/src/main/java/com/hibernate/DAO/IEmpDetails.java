package com.hibernate.DAO;

import java.util.List;

import org.springframework.jdbc.object.SqlQuery;

import com.hibernate.Entity.EmpDetali;

public interface IEmpDetails {
	
	public SqlQuery<Object[]> retriver();
	
}
