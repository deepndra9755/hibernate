package com.hibernate.DAO;

import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;

public class BankUpdationImpl implements IBankUpdation {

	@Override
	public List<SbiBank> DisplayingRecord() {
		// TODO Auto-generated method stub
		Transaction tx=null;
		Session ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		Criteria ct=ses.createCriteria(SbiBank.class);
		List<SbiBank> sb=ct.list();
		return sb;
	}

	


}
