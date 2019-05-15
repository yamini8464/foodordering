package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CustomerDAO;
import com.ts.dto.Customer;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int  custId=Integer.parseInt(request.getParameter("custId"));
		String name=request.getParameter("name");
		String userId=request.getParameter("userId");
		String phno=request.getParameter("phno");
		String dno=request.getParameter("dno");
		String street=request.getParameter("street");
		String password=request.getParameter("password");
		Customer customer = new Customer(custId,name,userId,password,phno,dno,street);
		CustomerDAO customerDAO = new CustomerDAO();
		int x=customerDAO.update(customer);
		System.out.println(x);
		RequestDispatcher rd = request.getRequestDispatcher("CustomerHomePage.jsp");
		rd.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
