package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
@WebServlet("/DisplayQuantity")
public class DisplayQuantity extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//String[] myJsonData = request.getParameterValues("json[]");
		
	/*	List<String> items = (List<String>) request.getAttribute("names");
		
		for(String item: items)
		   System.out.println(item);
		*/
		HttpSession session = request.getSession(true);
		String val[] = request.getParameterValues("selected");
		String[] names = request.getParameterValues("names");
		String name=request.getParameter("name");
		System.out.println("In Display"+name);
		String name1[]=name.split(",");
		int restId=Integer.parseInt(name1[0]);
		int custId=Integer.parseInt(name1[1]);
		Customer customer=new Customer();
		customer.setCustId(custId);
		Restaurant restaurant=new Restaurant();
		restaurant.setRestId(restId);
		String street=(String)session.getAttribute("street");
		String dno= (String)session.getAttribute("dno");
		Date dt = new Date(System.currentTimeMillis());
		System.out.println(dt);
		Order order= new Order(customer,restaurant,dt,dno,street);
		OrderDAO orderDAO=new OrderDAO();
		int x = orderDAO.register(order);
		for(int i=0;i<names.length;i++){
			int p=Integer.parseInt(names[i]);
	        Items item = new Items();
	        item.setItemId(p);
	        OrderDetails orderDetails = new OrderDetails(order,item,1);
	        OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAO();
	        int y = orderDetailsDAO.register(orderDetails);
	        System.out.println(y);
		}
		List<Integer> orderDetails=null;
		OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAO();
		orderDetails=orderDetailsDAO.getOrderDetailsByorderId(order.getOrderId());

		session.setAttribute("orderId", order.getOrderId());
		session.setAttribute("date", order.getDate());
		System.out.println(""+orderDetails.size());
		List<Items> arrayList=(List<Items>) session.getAttribute("itemsData"); 
		List<Items> it=new ArrayList<Items>();
		System.out.println(arrayList);
		for(Items item:arrayList){
			for(int i=0;i<orderDetails.size();i++){
				if(item.getItemId()==orderDetails.get(i)){
					it.add(item);
				}
					
			}
					
		}
		session.setAttribute("items", it);
		RequestDispatcher rd = request.getRequestDispatcher("Cart.jsp");
		rd.forward(request, response);	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
