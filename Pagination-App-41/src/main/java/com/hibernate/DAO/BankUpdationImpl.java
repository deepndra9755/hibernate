package com.hibernate.DAO;

import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;

public class BankUpdationImpl implements IBankUpdation {
	public static final String PAGINATION_GETTER_RECORD="from com.hibernate.Entity.SbiBank";
	Transaction tx = null;
	Session ses = null;

	@Override
	public List<SbiBank> GettingRecord() {
		// TODO Auto-generated method stub
        ses=HBNutility.getSession();
        tx=ses.beginTransaction();
        Query<SbiBank> sbi=ses.createQuery(PAGINATION_GETTER_RECORD);
        sbi.setFirstResult(1);
      
        sbi.setMaxResults(2);
        
        List<SbiBank> objs=sbi.getResultList();
        
        System.out.println(objs.size());
		return objs;
	}

}
