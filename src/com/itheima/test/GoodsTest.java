package com.itheima.test;

import com.itheima.demo1.Goods;

public class GoodsTest {
	public static void main(String[] args) {
		// 1、创建一个数组
		Goods[] arr = new Goods[3];
		// 2、动态初始化
		Goods g1 = new Goods("001", "华为P40", 5999.0, 100);
		Goods g2 = new Goods("002", "保温杯", 227.0, 50);
		Goods g3 = new Goods("003","枸杞", 12.7, 70);

		// 3、添加商品
		arr[0]=g1;
		arr[1]=g2;
		arr[2]=g3;

		//4、遍历
		for(int i = 0; i < arr.length; i++) {
			//i索引 arr[i] 元素
			Goods goods = arr[i];
			System.out.println(goods.getId() + ", " + goods.getName() 
			+ ", " + goods.getPrice() + ", " + goods.getCount());

		}
		
	}
}
