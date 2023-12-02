package com.namaste.model;
import java.util.Scanner;

public class Lunch {

	String[] starterArr = {null, "Samosa", "Samosa Chaat", "Chicken 65", "Pakora"};
	String[] mainDishArr = {null, "Butter Chicken", "Tikka Masala", "Biryani", "Tandoori Chicken"};
	String[] drinksArr = {null, "Lassi", "Chai", "Beer", "Chaas"};

	Order order;
	private String starter;
	private String mainDish;
	private String drink;

	public Order makeOrder(int index1, int index2, int index3) {
		try{
			starter = starterArr[index1];
			mainDish = mainDishArr[index2];
			drink = drinksArr[index3];
			order = new Order(starter, mainDish, drink);
			//finalize();
		}
		catch (Exception e) {
			System.out.println("Null pointer exception");
		}
		return order;
	}
}
