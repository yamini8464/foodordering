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

import com.ts.dao.RestaurantDAO;
import com.ts.dto.Restaurant;

@WebServlet("/DisplayAllRestaurants")
public class DisplayAllRestaurants extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RestaurantDAO restDAO=new RestaurantDAO();
		List<Restaurant> arrayList = restDAO.getAllRestaurants();
		request.setAttribute("restData", arrayList);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayAllRestaurants.jsp");
		rd.forward(request, response);		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
