package com.chen.constructor;

/**
 * 建造者模式
 * @author: jinchenchen
 * @date: 2021/7/29
 */
public class BuilderPerson {
    private Long id;
    private String name;
    private Integer age;
    private Integer height;

    public BuilderPerson(Builder builder) {
        id = builder.id;
        name = builder.name;
        age = builder.age;
        height = builder.height;
    }

    public BuilderPerson() {
    }

    public static class Builder {
        // 必须参数
        private Long id;
        // 可选参数
        private String name;
        private Integer age;
        private Integer height;

        public Builder(Long id) {
            this.id = id;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        public BuilderPerson build() {
            return new BuilderPerson(this);
        }
    }

}
