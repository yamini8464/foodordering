package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.OrderDAO;
import com.ts.dao.OrderDetailsDAO;
import com.ts.dto.Customer;
import com.ts.dto.Items;
import com.ts.dto.Order;
import com.ts.dto.OrderDetails;
import com.ts.dto.Restaurant;
@WebServlet("/Final123")
public class Final123 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//String dno=a[0];
		//String street=a[1];
		String dno=request.getParameter("dno");
		String street=request.getParameter("street");
		System.out.println(dno);
		System.out.println(street);
		HttpSession session = request.getSession(true);
		int custId=(int) session.getAttribute("custId");
		int restId=(int) session.getAttribute("restId");
		int orderId=(int) session.getAttribute("orderId");
		Date date=(Date) session.getAttribute("date");
		Customer customer=new Customer();
		customer.setCustId(custId);
		Restaurant restaurant=new Restaurant();
		restaurant.setRestId(restId);
		Order order = new Order(orderId,customer,restaurant,date,dno,street);
		OrderDAO  orderDAO = new OrderDAO();
		int x = orderDAO.update(order);
		System.out.println(x);
		/*List<Items> items=(ArrayList<Items>)session.getAttribute("items");
		String []names=(String[]) session.getAttribute("quantity");
           for(int j=0; j<items.size();j++){
        	 int p = Integer.parseInt(names[j]);
        	 
			Order order1 = new Order();
			order1.setOrderId(orderId);
			Items items1 = new Items();
			items1.setItemId((items1).getItemId());
			System.out.println(orderId+" "+items1.getItemId());
			OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAO(); 
			
			OrderDetails  orderDetails = new OrderDetails(order1,items1,p);
			int y = orderDetailsDAO.register(orderDetails);
			System.out.println(y);
       }*/
		RequestDispatcher rd = request.getRequestDispatcher("ThankYou.jsp");
		rd.include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
