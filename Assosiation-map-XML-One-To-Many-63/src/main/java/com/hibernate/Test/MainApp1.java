package com.hibernate.Test;

import java.util.HashSet;
import java.util.Set;

import com.hibernate.DAO.ApartImpl;
import com.hibernate.DAO.IApart;
import com.hibernate.Entity.Apartment;
import com.hibernate.Entity.Interial;

public class MainApp1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interial ov=new Interial();
		ov.setColor("shibn");
		ov.setPowerCunsumtion(99);
	
		System.out.println(ov+"first intereal");
		Interial oy=new Interial();
		oy.setColor("hinem");
		oy.setPowerCunsumtion(45);
		
		System.out.println(oy+"seconf oy");
		
		HashSet<Interial> ks=new HashSet<Interial>();
		ks.add(ov);
		ks.add(oy);
		
		
		
		
		System.out.println(ks+"     final set       ");
		
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
		obd.setAddress("itarsi");
		obd.setMobile(82250);
		obd.setHouseNum(111);
		obd.setOwnername("nirmal");
		obd.setInteria(ks);
		
        IApart p=new ApartImpl();
        p.InsertStd(obd);
	
	}
}
