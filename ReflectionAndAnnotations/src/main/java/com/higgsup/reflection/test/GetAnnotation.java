package com.higgsup.reflection.test;

import com.higgsup.reflection.entity.Student;

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
