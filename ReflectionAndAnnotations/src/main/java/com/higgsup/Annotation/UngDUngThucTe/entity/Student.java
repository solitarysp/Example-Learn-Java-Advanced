package com.higgsup.Annotation.UngDUngThucTe.entity;

import com.higgsup.Annotation.UngDUngThucTe.annotation.Colum;
import com.higgsup.Annotation.UngDUngThucTe.annotation.Table;

@Table(name="student")
public class Student {
    @Colum(name = "id")
    private Integer id;
    @Colum(name = "name")
    private String name;
    @Colum(name = "age")
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
}
