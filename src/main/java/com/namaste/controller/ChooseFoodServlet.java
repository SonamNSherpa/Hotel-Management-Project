package com.namaste.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namaste.Service.OrderService;
import com.namaste.model.Breakfast;
import com.namaste.model.Lunch;
import com.namaste.model.Order;

public class ChooseFoodServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {


		int i = Integer.parseInt(req.getParameter("starter"));
		int j = Integer.parseInt(req.getParameter("main"));
		int s = Integer.parseInt(req.getParameter("drink"));
		String set =req.getParameter("order");
		
		if(set.equals("Submit Breakfast")) {
			Breakfast breakf = new Breakfast();
			OrderService orderService = new OrderService();
			Order order = breakf.makeOrder(i,j,s);
			orderService.addOrder(order);
		}
		else if(set.equals("Submit Lunch")) {
			Lunch lunch = new Lunch();
			OrderService orderService = new OrderService();
			Order order = lunch.makeOrder(i,j,s);
			orderService.addOrder(order);
		}
		try {
			RequestDispatcher rd= req.getRequestDispatcher("/index.jsp");
			req.setAttribute("insertRes","success");
			rd.forward(req, res);
			}catch (NumberFormatException e) {
				RequestDispatcher rd= req.getRequestDispatcher("/index.jsp");

				req.setAttribute("insertRes", "there is an issue in your request pls correct it");
				rd.forward(req, res);
			}

	}
}
