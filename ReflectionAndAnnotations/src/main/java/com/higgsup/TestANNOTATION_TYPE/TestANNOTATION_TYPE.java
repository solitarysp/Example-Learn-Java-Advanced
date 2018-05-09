package com.higgsup.TestANNOTATION_TYPE;

import com.higgsup.Annotation.ungdungthucte.annotation.Colum;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestANNOTATION_TYPE {
    private String id;

    @Anno2("VN")
    public static String getId(String anno2) {
        return anno2;
    }


    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.higgsup.TestANNOTATION_TYPE.TestANNOTATION_TYPE");
        for (Method field : aClass.getDeclaredMethods()
                ) {
            if (field.isAnnotationPresent(Anno2.class)) {
                System.out.println("Annotion Anno2");
                Annotation annotation = field.getAnnotation(Anno2.class);
                if (annotation.getClass().isAnnotationPresent(Anno1.class)) {
                    System.out.println("Annotion Anno1");
                }
            }

        }
    }
}
