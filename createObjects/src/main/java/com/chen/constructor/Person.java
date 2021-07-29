package com.chen.constructor;

/**
 * 普通的构造方法
 * @author: jinchenchen
 * @date: 2021/7/29
 */
public class Person {
    private Long id;
    private String name;
    private Integer age;
    private Integer height;

    public Person() {
    }

    public Person(Long id, String name, Integer age, Integer height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
