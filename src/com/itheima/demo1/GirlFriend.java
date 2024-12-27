package com.itheima.demo1;

public class GirlFriend {
	private int age;
	private String name;
	private String gender;
	
	//针对每一个私有的成员变量，都要提供set 和 get方法
    //set 用于给成员变量进行赋值
	//get 用于对外提供变量的量
	//age:
	public void setAge(int age) {
		if (age >= 18 && age <= 50) {
			this.age = age;
		} else {
			System.out.println("非法参数");
		}
	}

	public int getAge() {
		return age;
	}
	
	//name:
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//gender:
	public void setGender(String gender) {
		//string判断留待以后
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	
	public void sleep() {
		System.out.println("在睡觉");
	}
	public void eat() {
		System.out.println("在吃饭");
	}

}
