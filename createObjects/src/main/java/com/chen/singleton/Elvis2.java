package com.chen.singleton;

/**
 * 使用公有静态方法返回单例模式
 * @author: jinchenchen
 * @date: 2021/7/29
 */
public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2 () {}

    public static Elvis2 getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {

    }
}