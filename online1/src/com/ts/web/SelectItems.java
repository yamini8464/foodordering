package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.ItemsDAO;
import com.ts.dto.Items;
import com.ts.dto.Restaurant;

@WebServlet("/SelectItems")
public class SelectItems extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			int restId=Integer.parseInt(request.getParameter("id"));
			ItemsDAO itemsDAO=new ItemsDAO();
			List<Items> arrayList = itemsDAO.getItemsByRestId(restId);
			HttpSession session = request.getSession(true);
			session.setAttribute("restId",restId);
			System.out.println(""+arrayList.size());
			session.setAttribute("no.Items",arrayList.size());
			session.setAttribute("itemsData", arrayList);
			RequestDispatcher rd = request.getRequestDispatcher("SelectItems.jsp");
			rd.forward(request, response);	
		
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
