package com.namaste.Service;

import com.namaste.OrderDao.OrderDao;
import com.namaste.model.Order;
import java.sql.SQLException;
import java.util.List;


public class OrderService {
	OrderDao orderDao;
	public OrderService() {
		orderDao = new OrderDao();
	}

	public void addOrder(Order order) {
		orderDao.addOrder(order);
	}
	
	public List<Order> readOrders() throws ClassNotFoundException, SQLException{
		return orderDao.readOrders();
	}

}
