package com.chen.constructor;

/**
 * setter 模式
 * @author: jinchenchen
 * @date: 2021/7/29
 */
public class SetterPerson {
    private Long id;
    private String name;
    private Integer age;
    private Integer height;

    public SetterPerson() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
