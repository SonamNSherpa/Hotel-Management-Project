package com.namaste.model;
import java.util.Scanner;

public class Breakfast {
	String[] starterArr = {null, "Garlic Bread", "French Fries", "Muffins", "Cinnamon Rolls"};
	String[] mainDishArr = {null, "Egg and toast", "Omletes", "Pancakes", "French toast"};
	String[] drinksArr = {null, "Coffee", "Orange juice", "Pineapple juice", "Mango Juice"};
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
			
		}
		catch (Exception e) {
			System.out.println("Null pointer exception");
		}
		return order;
	}
}
