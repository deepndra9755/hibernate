package com.hibernate.DAO;

import java.util.List;

import org.hibernate.Filter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.Civil;
import com.hibs.utility.HBNutility;

public class DAOimpl {

	
	public List<Civil> selectingTab()
	{
		Session ses=null;
		Transaction tx=null;
		List<Civil> lst=null;
		try {
			
		
		ses=HBNutility.getSession();
		 tx=ses.beginTransaction();
		Filter fs=ses.enableFilter("FILTR_DEFID");
		fs.setParameter("param1","null");
		Query<Civil> qr=ses.createQuery("from Civil");
		
		lst=qr.getResultList();
	
	} catch (HibernateException e) {
		// TODO: handle exception
		e.printStackTrace();
		throw e;
	}
		
	return lst;
}
}