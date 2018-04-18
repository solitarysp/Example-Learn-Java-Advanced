package com.higgsup.Reflection.entity;

import com.higgsup.Reflection.listinterface.ExampleAnnotation;

@ExampleAnnotation(id = 1)
public class Student {
    public int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
