package com.hibernate.Test;

import com.hibernate.DAO.ApartImpl;
import com.hibernate.Entity.Interial;

public class AddingChildRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApartImpl js=new ApartImpl();
    Interial hg=new Interial();
    hg.setColor("silver");
    hg.setPowerCunsumtion(34);
    
    js.addNewChile(1,hg);
	}

}
