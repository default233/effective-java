package com.chen.singleton;

/**
 * 能够序列化和反序列化的单例示例
 * @author: jinchenchen
 * @date: 2021/7/29
 */
public class Elvis3 {
    private static final transient Elvis3 INSTANCE = new Elvis3();
    private Elvis3 () {}

    public static Elvis3 getInstance() {
        return INSTANCE;
    }

    /**
     * 反序列化方法，可以通过该方法获取单例对象
     * @return 单例对象
     */
    private Object readResolve() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {

    }
}
