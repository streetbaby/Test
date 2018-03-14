package com.markie.test.entity;

public class TestEntity {

    private String name;
    private Integer age;
    
    public TestEntity() {}

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

    @Override
    public String toString() {
        return "age : " + this.age + ", name : " + this.name;
    }
}
