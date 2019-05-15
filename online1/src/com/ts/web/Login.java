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


@WebServlet("/Login")
public class Login extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String user = request.getParameter("username");
			String pass = request.getParameter("password");
			CustomerDAO customerDao = new CustomerDAO();
			Customer customer = customerDao.getCustomer(user);
			out.print("<html>");
			if(customer != null) {
				out.println("hai");
				HttpSession session = request.getSession(true);
				session.setAttribute("user", user);
				session.setAttribute("pass", pass);
				session.setAttribute("custId", customer.getCustId());
				session.setAttribute("dno", customer.getDno());
				session.setAttribute("street", customer.getStreet());
				out.println(user+"  " + pass);
				out.println(customer.getUserId()+"  " + customer.getPassword());
				if(customer.getUserId().equals(user)&& !customer.getPassword().equals(pass)) {
					out.print("<body>");
					out.print("<center><h2>Enter Correct Password...</h2></center>");
					RequestDispatcher rd = request.getRequestDispatcher("Login.html");
					rd.include(request, response);
					out.print("</body>");
				}
				else if(customer.getCustId() == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
					rd.include(request, response);	
				}
				else
				{
					RequestDispatcher rd = request.getRequestDispatcher("CustomerHomePage.jsp");
					rd.forward(request, response);
				}
			}
			else if(customer == null)
			{
				out.print("<body>");
				out.print("<center><h1>Invalid Credentials...</h1></center>");
				out.print("<center><h1>Please Sign Up..</h1></center>");
				RequestDispatcher rd = request.getRequestDispatcher("SignUp.html");
				rd.include(request, response);
				out.print("</body>");			
			}
			out.println("</html>");	
	}

	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
