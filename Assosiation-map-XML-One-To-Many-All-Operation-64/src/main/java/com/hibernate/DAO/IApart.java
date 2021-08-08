package com.hibernate.DAO;

import com.hibernate.Entity.Apartment;
import com.hibernate.Entity.Interial;

public interface IApart {
	
     //here we are only printing data of db and we're not performimg any other operation
   //thats'why we are returning void
	void InsertStd(Apartment on);
	
	void SelectOperation(int i);
    
//	  void updationRecord(Apartment m);

	void updationRecord(int h,Apartment neww);
	
	public void addNewChile(int id,Interial child);
	
	public void DeletingApartPt(String name);
}
