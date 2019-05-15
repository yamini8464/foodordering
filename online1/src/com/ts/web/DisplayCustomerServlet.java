package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.CustomerDAO;
import com.ts.dto.Customer;

@WebServlet("/DisplayCustomerServlet")
public class DisplayCustomerServlet extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		String userId =(String) session.getAttribute("user");
		CustomerDAO customerDAO = new CustomerDAO();
		Customer cust = customerDAO.getCustomer(userId);
		request.setAttribute("customerData", cust);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayProfile.jsp");
		rd.include(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
