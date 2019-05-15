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

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String name=request.getParameter("name");
			String userId=request.getParameter("userId");
			String phno=request.getParameter("phno");
			String dno=request.getParameter("dno");
			String street=request.getParameter("street");
			String password=request.getParameter("password");
			
			Customer customer = new Customer(name,userId,phno,password,dno,street);
			System.out.println(customer.getCustName());
			CustomerDAO customerDAO = new CustomerDAO();
			int x=customerDAO.register(customer);
			out.println(x);
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
				out.println("<h3><CENTER>Registration Success .."+x+" Rows inserted...</CENTER></H3>");
			
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
