package com.higgsup.Reflection.test;

import com.higgsup.Reflection.entity.Student;

import java.lang.annotation.Annotation;

public class GetAnnotation {
    public static void main(String[] args) {
        Annotation[] annotations = Student.class.getAnnotations();
        for (Annotation annotation :annotations
             ) {
            System.out.println(annotation.toString());
        }
    }
}
