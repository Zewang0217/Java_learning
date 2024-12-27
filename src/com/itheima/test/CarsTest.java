package com.itheima.test;

import com.itheima.demo1.Cars;

import java.util.Scanner;

public class CarsTest {
	public static void main(String[] args) {
		//1、创建一个数组用来存三个汽车对象
		Cars[] arr = new Cars[3];
		
		//2、创建汽车对象，数据来源于键盘录入
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			//创建汽车对象（临时变量，增加可读性与简洁性）
			Cars c = new Cars();
			//录入品牌
			System.out.println("请输入一个品牌: ");
			String brand = sc.next();
			c.setBrand(brand);
			//录入价格
			System.out.println("请输入汽车价格： ");
			int price = sc.nextInt();
			c.setPrice(price);
			//录入颜色
			System.out.println("请输入汽车颜色： ");
			String color = sc.next();
			c.setColor(color);
			//把汽车对象添加到数组当中
			arr[i] = c;
			
		}
		for(int i = 0; i < arr.length; i++) {
			Cars car = arr[i];//临时变量
			System.out.println(car.getBrand() + ", " + car.getPrice()
			+ ", " + car.getColor() );
		}
	}
}
