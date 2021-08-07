package com.hibernate.DAO;

import java.util.List;

import javax.persistence.NamedQuery;
import javax.persistence.Parameter;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;

public class BankUpdationImpl implements IBankUpdation {

	

	@Override
	public List<SbiBank> DisplayingRecord() {
		Transaction tx=null;
		Session ses=HBNutility.getSession();
		tx=ses.beginTransaction();	
		/*
		 * code for selecting all records like Entity QRy
		 * CriteriaBuilder cb=ses.getCriteriaBuilder();
		 * CriteriaQuery<SbiBank>ctq=cb.createQuery(SbiBank.class); Root<SbiBank>
		 * rd=ctq.from(SbiBank.class); ctq.select(rd); javax.persistence.Query
		 * q=ses.createQuery(ctq); List<SbiBank> g=q.getResultList();
		 * 
		 */ 
		
		
		//this is for with condition
		
//		                 CriteriaBuilder cb=ses.getCriteriaBuilder();
//		         
//		                CriteriaQuery<SbiBank> cq=cb.createQuery(SbiBank.class);
//	
//		                Root<SbiBank> rt=cq.from(SbiBank.class);
//		                
//		                cq.select(rt);
//		                
//		               ParameterExpression<Float> p1=cb.parameter(Float.class,"Amount");
//		               //ParameterExpression<Float> p2=cb.parameter(Float.class,"Amount");
//		               
//		                Predicate pd=cb.ge(rt.get("Amount"),p1);
//		                cq.where(pd);
//		                 javax.persistence.Query q=ses.createQuery(cq);
//		                 q.setParameter(p1,5000.0f);
//		                 List<SbiBank> h=q.getResultList();
//
		                
		
		
		
		       CriteriaBuilder cb=ses.getCriteriaBuilder();
		       
		       CriteriaQuery<SbiBank> cq=cb.createQuery(SbiBank.class);
		       
		       Root<SbiBank> rt=cq.from(SbiBank.class);
		       
	           cq.select(rt);
	           
	             ParameterExpression<Float> p1=cb.parameter(Float.class,"Amount"); 
	             ParameterExpression<String> p2=cb.parameter(String.class,"customerNAME");
	             
	              
                 Predicate pd=cb.ge(rt.get("Amount"),p1);
                Predicate pd1=cb.like(rt.get("customerNAME"),p2);
                  Predicate pds=cb.and(pd,pd1);
                  cq.where(pds);
		       Query<SbiBank> qre=ses.createQuery(cq);
//		       qre.setParameter(pd,3000.0f);
//		       qre.setParameter(pd1,"a%");
		       qre.setParameter(p1,3000.0f);
		       qre.setParameter(p2,"a%");
		       
		       List<SbiBank> h=qre.getResultList();
		       
		
		
		       
		       
		       
		       CriteriaBuilder build=ses.getCriteriaBuilder();
		       
		       CriteriaQuery<Object[]> js=build.createQuery(Object[].class);
		       
		        Root<SbiBank> kd=js.from(SbiBank.class);
		        js.multiselect(kd.get("customerNAME"),kd.get("IFSC"));
		       
		       
		       
		       
		       
		       
		       
		return null;
	}

	


}
