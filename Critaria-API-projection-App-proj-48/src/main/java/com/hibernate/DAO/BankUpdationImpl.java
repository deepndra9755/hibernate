package com.hibernate.DAO;

import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.type.StandardBasicTypes;

import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;
import com.mysql.cj.x.protobuf.MysqlxCrud.Projection;
import com.sun.xml.bind.api.impl.NameConverter.Standard;

public class BankUpdationImpl implements IBankUpdation {

	@Override
	public List<Object[]> DisplayingRecord() {
		// TODO Auto-generated method stub
		List<Object[]>js=null;
		try
		{
		Transaction tx=null;
		Session ses=HBNutility.getSession();
		tx=ses.beginTransaction();
		Criteria ct=ses.createCriteria(SbiBank.class);
	       
        org.hibernate.criterion.Projection pj=Projections.property("customerNAME");
      org.hibernate.criterion.Projection pj1=Projections.property("ACnum");
      ProjectionList kd=Projections.projectionList();
      kd.add(pj1);
      kd.add(pj);
      
      Criterion cts=Restrictions.ge("ACnum",300); 
//    ProjectionList pod=Projections.projectionList();
//    pod.add(pod);
//    pod.add(pj1);
       
//      
      ct.setProjection(kd);
        ct.add(cts);
       js=ct.list();
       System.out.println(js.size());
	
		}
		catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	return js;
	}}
	



