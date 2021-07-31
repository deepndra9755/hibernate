package com.hibernate.TestApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.Voter_id;
import com.hibs.utility.HBNutility;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		try
		{
			ses=HBNutility.getSession();
			System.out.println();
			tx=ses.beginTransaction();
			Voter_id obj=new Voter_id();
			obj.setAddress("Main_road_sendhwads");
			obj.setAge(23);
			//obj.setMob(392023L);
			obj.setVoterID(new Random().nextInt(20000)+"");
			List<Integer> obj1=new ArrayList<Integer>();
			obj1.add(9977732);
			obj1.add(938822);
			obj.setMobile(obj1);
			ses.save(obj);
			flag=true;
		}
		catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(flag==true)
			{
			tx.commit();
			System.out.println("record inserted");
			}
			else
			{
				tx.rollback();
				System.out.println("got failed");
			}
		}

	}

}
