package com.itheima.demo1;

public class Cars {
	private String brand;//品牌
	private int price;//价格
	private String color;//颜色
	
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cars(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
