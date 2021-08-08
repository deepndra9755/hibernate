package com.hibs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibs.Entity.ProductOn;
import com.hibs.MultiTT.StandAloneSER;
import com.hibs.utility.HBNutility;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ProductOn  sd=new ProductOn();
			ProductOn  sd1=new ProductOn();
			ProductOn  sd2=new ProductOn();
sd.setName("shivani");sd.setCompany("PDX");sd.setCode(1832);sd.setType("vegitab");
		
sd1.setName("jayraj");sd1.setCompany("JBL");sd1.setCode(2340);sd1.setType("non");

sd2.setName("jiten");sd2.setCompany("IMB");sd2.setCode(3830);sd2.setType("both");

StandAloneSER obj=new StandAloneSER(sd);
			Thread t=new Thread(obj);
			t.setName("first");
			t.start();
			
			StandAloneSER obj1=new StandAloneSER(sd1);
			Thread t1=new Thread(obj1);
			t1.setName("second");
			t1.start();
			
			StandAloneSER obj2=new StandAloneSER(sd2);
			Thread t2=new Thread(obj2);
			t2.setName("third");
			t2.start();
		
	}

}
