package com.namaste.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namaste.model.Order;
import com.namaste.Service.OrderService;

public class ReadOrderServlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OrderService orderService=new OrderService();
		try {
			List<Order> listOrders=orderService.readOrders();
			RequestDispatcher rd= req.getRequestDispatcher("/index.jsp");
			req.setAttribute("orders", listOrders);
			rd.forward(req, resp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
