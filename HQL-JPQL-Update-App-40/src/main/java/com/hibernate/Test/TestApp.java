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
	try {
	int count=obj.UpdataionRecord("kamal",40440.0f);
	if(count>0)
	{
		System.out.println("record updation success ");
	}
	else
	{
		System.out.println("failed");
	}
	}
	catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	}
}}
