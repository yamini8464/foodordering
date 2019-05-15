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

import java.util.ArrayList;
import java.util.List;

import com.ts.dto.Items;


@WebServlet("/PaymentTotal")
public class PaymentTotal extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String[] names = request.getParameterValues("quantity");
		/*for(int i=0;i<names.length;i++){
			System.out.println("quantity="+names[i]);
		}*/
		List<Items> items=(ArrayList<Items>)session.getAttribute("items");
		//String p=request.getParameter("quantity");
		//System.out.println("ytiop is "+p);
		int tot=0;
        for(int j=0; j<items.size();j++){
        	Items item=items.get(j);
        	int p = Integer.parseInt(names[j]);
        	tot=tot+item.getPrice()*p;
        }
        System.out.println("total is"+tot);
		session.setAttribute("tot", tot);
		session.setAttribute("quantity", names);
        RequestDispatcher rd = request.getRequestDispatcher("CardDetails.jsp");
		rd.forward(request, response);	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
