package com.higgsup.reflection.entity;

public abstract class Dog {
    private String name;
    public Integer age;
    protected Integer with;

    public Integer getWith() {
        return with;
    }

    public void setWith(Integer with) {
        this.with = with;
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

    public abstract void dogSay();

    private void testMethodCha() {

    }
}
