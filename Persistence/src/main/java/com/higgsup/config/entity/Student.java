package com.higgsup.config.entity;/*
  By Chi Can Em  03-04-2018
 */

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("xóa : " + id + " tại lúc  " + new Date().toString());
    }

    static public Integer TEST_ROOT = 1;
}
