package com.chen.singleton;

/**
 * 公有成员变量方式返回单例对象
 * @author: jinchenchen
 * @date: 2021/7/29
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis () {}

    public void leaveTheBuilding() {

    }
}
