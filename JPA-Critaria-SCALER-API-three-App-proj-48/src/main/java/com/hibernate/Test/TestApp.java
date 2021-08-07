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
	
	List<SbiBank> f=obj.DisplayingRecord();
	for(SbiBank sf:f)
	{
		System.out.println(sf);
	}
	

}

}
