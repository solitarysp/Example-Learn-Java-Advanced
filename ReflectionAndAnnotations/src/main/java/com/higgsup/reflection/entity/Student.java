package com.higgsup.reflection.entity;

import com.higgsup.reflection.listinterface.ExampleAnnotation;

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
