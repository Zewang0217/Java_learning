package com.itheima.test;

import com.itheima.demo1.Role;

public class GameTest {
    public static void main(String[] args) {
        // 创建角色
        Role r1 = new Role("qiao", 100, '男');
        Role r2 = new Role("chu", 110, '女');

        //展示角色
        r1.show();
        r2.show();

        // 开始格斗
        while (true) {
            r1.attack(r2);
            // 判断r2的剩余血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + " K.O " + r2.getName());
                break;
            }
            r2.attack(r1);
            // 判断r1的剩余血量
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + " K.O " + r1.getName());
                break;
            }
        }


    }
}
