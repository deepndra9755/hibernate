package com.hibernate.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Random;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.DAO.Bankimpl;
import com.hibernate.Entity.SbiBank;
import com.hibs.utility.HBNutility;

public class TestApp {
	
public static void main(String[] args) {
   
	Bankimpl obj=new Bankimpl();
	System.out.println(obj.insert(40));
	
}}
