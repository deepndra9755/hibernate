package com.hibernate.Test;

import java.util.HashSet;
import java.util.Set;

import com.hibernate.Entity.Apartment;
import com.hibernate.Entity.Interial;

public class MainApp1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Interial ob=new Interial();
		ob.setColor("red");
		ob.setPowerCunsumtion(456);
		
		Set<Interial> og=new HashSet<Interial>();
		og.add(ob);
		
		Apartment obd=new Apartment();
		obd.setAddress("indore");
		obd.setMobile(99777);
		obd.setHouseNum(456);
		obd.setOwnername("kamal");
		obd.setInteria(og);
		

	}

}
