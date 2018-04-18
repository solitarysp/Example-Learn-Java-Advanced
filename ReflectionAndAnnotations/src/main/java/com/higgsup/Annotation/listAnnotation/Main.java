package com.higgsup.Annotation.listAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        Class<Student> studentClass = Student.class;
        for (Method method : studentClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                Annotation annotation = method.getAnnotation(Test.class);
                Test Test = (Test) annotation;
                System.out.println(Test.value());
                System.out.println(Test.name());
            }
        }

    }
}
