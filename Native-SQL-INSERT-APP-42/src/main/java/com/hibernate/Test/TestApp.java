package com.hibernate.Test;

import java.util.List;
import java.util.Random;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.DAO.BankUpdationImpl;
import com.hibernate.DAO.IBankUpdation;
import com.hibernate.DTO.DTOimpl;
import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;

public class TestApp {
	
public static void main(String[] args) {
   
	IBankUpdation obj1=new BankUpdationImpl();
	
	DTOimpl obj=new DTOimpl();
	obj.setACnum(883920);
	obj.setAmount(101010.0f);
	obj.setIFSC("SHFIII932");
    obj.setPid(new Random().nextInt(1000));
    obj.setCustomerNAME("vishal");
    System.out.println(obj1.InsertingAC(obj));
    
	}
}
