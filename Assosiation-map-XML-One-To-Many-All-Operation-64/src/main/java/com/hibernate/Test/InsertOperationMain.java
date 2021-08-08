package com.hibernate.Test;

import java.util.HashSet;
import java.util.Set;

import com.hibernate.DAO.ApartImpl;
import com.hibernate.DAO.IApart;
import com.hibernate.Entity.Apartment;
import com.hibernate.Entity.Interial;

public class InsertOperationMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interial ov=new Interial();
		ov.setColor("abhishek");
		ov.setPowerCunsumtion(127);
	
		//System.out.println(ov+"first intereal");
		Interial oy=new Interial();
		oy.setColor("anurag");
		oy.setPowerCunsumtion(213);
		
		//System.out.println(oy+"seconf oy");
		
		HashSet<Interial> ks=new HashSet<Interial>();
		ks.add(ov);
		ks.add(oy);
		
		
		
		
		//System.out.println(ks+"     final set       ");
		
//		
//		Interial ob=new Interial();
//		ob.setColor("krm");
//		ob.setPowerCunsumtion(256);
//		
//		Interial ob1=new Interial();
//		ob.setColor("colr");
//		ob.setPowerCunsumtion(3256);
//		
//		Set<Interial> og=new HashSet<Interial>();
//		og.add(ob);
//		og.add(ob1);
//		System.out.println(og);
		
		Apartment obd=new Apartment();
		//obd.setId(1);
		obd.setAddress("bamanala");
		obd.setMobile(997774);
		obd.setHouseNum(1945);
		obd.setOwnername("rakesh");
		obd.setInteria(ks);
		
        IApart p=new ApartImpl();
        p.InsertStd(obd);
	
	}
}
