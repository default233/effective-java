package com.chen.uninstance;

/**
 * 私有构造方法避免实例化
 * @author: jinchenchen
 * @date: 2021/7/29
 */
public class UtilityClass {
    private UtilityClass() {
        throw new AssertionError();
    }
}
