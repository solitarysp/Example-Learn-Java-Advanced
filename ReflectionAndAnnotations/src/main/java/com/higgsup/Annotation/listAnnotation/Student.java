package com.higgsup.Annotation.listAnnotation;

public class Student {

    private int id;

    @Deprecated
    @Test(value = 1, name = "tests")
    public int getId() {
        return id;
    }

    @Test3()
    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }
}
