package com.hibernate.Test;

import java.util.List;

import com.hibernate.DAO.DAOimpl;
import com.hibernate.Entity.Civil;

public class TestApp {
	
public static void main(String[] args) {
   
DAOimpl d=new DAOimpl();
List<Civil> gd=d.selectingTab();

for(Civil h:gd)
{
System.out.println(h);	
}

}

}
