package com.hibernate.Test;

import java.util.List;
import java.util.Random;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.DAO.BankUpdationImpl;
import com.hibernate.DAO.IBankUpdation;
import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;

public class TestApp {
	
public static void main(String[] args) {
   
	IBankUpdation obj=new BankUpdationImpl();
	
     List<Object[]> f=obj.DisplayingRecord();
	for(Object []s:f)
	{	
				
	System.out.println("name "+s[0]+" "+s[1]);
	}
	

}

}
