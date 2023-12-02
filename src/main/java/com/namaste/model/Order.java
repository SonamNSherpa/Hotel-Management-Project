package com.namaste.model;

public class Order {
	private String starter;
	private String mainDish;
	private String drink;
	private double price;
	private int id;

	public Order(String starter, String mainDish, String drink) {
		this.starter = starter;
		this.mainDish = mainDish;
		this.drink = drink;
	}
	public Order(int id, String starter, String mainDish, String drink, double price) {
		this.id = id;
		this.starter = starter;
		this.mainDish = mainDish;
		this.drink = drink;
		this.price = price;
	}
	public String getStarter() {
		return starter;
	}
	public String getMainDish() {
		return mainDish;
	}
	public String getDrink() {
		return drink;
	}
	public void setStarter(String starter) {
		this.starter = starter;
	}
	public void setMainDish(String mainDish) {
		this.mainDish = mainDish;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setOrderId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return id;
	}


}
