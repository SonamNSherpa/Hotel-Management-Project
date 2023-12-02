package com.namaste.OrderDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.namaste.model.Order;
import com.namaste.util.DBConnection;
import java.util.List;
import java.util.ArrayList;

public class OrderDao {
    public void addOrder(Order order) {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            ps=con.prepareStatement("SELECT max(Orderno) FROM orders");
            ResultSet rs = ps.executeQuery();
            int maxId = 0;
            while(rs.next()) {
            	maxId = rs.getInt(1);
            }
            ps = con.prepareStatement("INSERT INTO orders (Orderno, Starters, Main_Dish, Drink, Price) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, ++maxId);
            ps.setString(2, order.getStarter());
            ps.setString(3, order.getMainDish());
            ps.setString(4, order.getDrink());
            ps.setDouble(5, 25);
            ps.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
        
        public List<Order> readOrders() throws ClassNotFoundException, SQLException{
        	List<Order> listOrders = new ArrayList();
        	PreparedStatement ps = null;
    		Connection con = null;
        	try{
        	
    		con = DBConnection.getConnection();
    		ps = con.prepareStatement("SELECT * FROM orders");
    		ResultSet rs = ps.executeQuery();
    		
    		
    		while (rs.next()) {
    			Order order = new Order(0, null, null, null, 0);
    			int id = rs.getInt(1);
    			order.setOrderId(id);
    			String Starter = rs.getString(2);
    			order.setStarter(Starter);
    			String MainDish = rs.getString(3);
    			order.setMainDish(MainDish);
    			String Drink = rs.getString(4);
    			order.setDrink(Drink);
    			double price = rs.getDouble(5);
    			order.setPrice(price);
    			listOrders.add(order);
    		}
    		con.close();
        	} 
        	catch(ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
			return listOrders;
        }
    	}
    

