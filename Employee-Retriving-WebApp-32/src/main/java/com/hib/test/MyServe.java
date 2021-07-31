package com.hib.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.dao.EmpImpl;
import com.hibernate.dao.IEmpDao;
import com.hibernate.service.EmployeeSallCalculator;
import com.hibernate.service.IEmpCal;
import com.hibernate.vo.Voimpl;
import com.hibs.utility.HBNutility;


public class MyServe extends HttpServlet  {

	IEmpCal obj;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
	     	obj=new EmployeeSallCalculator();
    	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		 int id=Integer.parseInt(request.getParameter("id"));
         
		try {
			Voimpl os=obj.EmpCal(id);
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			request.setAttribute("vo",os);
			if(os!=null)
			{
				rd.forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			pw.println("<h1>insertion got failed internal problem </h1>");
			e.printStackTrace();
			
		}
		finally {
		
		}
		
		pw.println("<h1>failde</h1>");
	}
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
