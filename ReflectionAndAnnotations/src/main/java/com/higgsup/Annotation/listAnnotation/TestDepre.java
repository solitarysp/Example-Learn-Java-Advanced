package com.higgsup.Annotation.listAnnotation;

public class TestDepre {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
    Student student=new Student();
    student.setId(1);
    student.getId();
    }
}
