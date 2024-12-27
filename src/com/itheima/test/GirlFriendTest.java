package com.itheima.test;

import com.itheima.demo1.GirlFriend;

public class GirlFriendTest {
    public static void main(String[] args) {
		//创建女朋友的对象
    	GirlFriend gf1 = new GirlFriend();
		gf1.setName("小小");
		gf1.setGender("w");
		gf1.setAge(-3);
    	
    	System.out.println(gf1.getName());
    	System.out.println(gf1.getGender());
    	System.out.println(gf1.getAge());
    	
    	gf1.sleep();
    	gf1.eat();
    	System.out.println("========================");
    	
    	GirlFriend gf2 = new GirlFriend();
    	gf2.setName ("ChuQingHan");
    	gf2.setGender("w");
    	gf2.setAge( 23);
    	
    	System.out.println(gf2.getName());
    	System.out.println(gf2.getGender());
    	System.out.println(gf2.getAge());
    	gf2.eat();
    	gf2.sleep();
    }	
}

/*输出：
非法参数
小小
w
0
在睡觉
在吃饭
========================
ChuQingHan
w
23
在吃饭
在睡觉

*/
//www.itheima.com

